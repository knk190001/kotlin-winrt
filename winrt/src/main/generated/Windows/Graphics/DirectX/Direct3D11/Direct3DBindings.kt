package Windows.Graphics.DirectX.Direct3D11

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(Direct3DBindings.ABI::class)
@Signature("enum(Windows.Graphics.DirectX.Direct3D11.Direct3DBindings;u4)")
@WinRTByReference(brClass = Direct3DBindings.ByReference::class)
public enum class Direct3DBindings(
  public val value: Int
) : NativeMapped {
  VertexBuffer(1),
  IndexBuffer(2),
  ConstantBuffer(4),
  ShaderResource(8),
  StreamOutput(16),
  RenderTarget(32),
  DepthStencil(64),
  UnorderedAccess(128),
  Decoder(512),
  VideoEncoder(1024),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Direct3DBindings {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> VertexBuffer
      2 -> IndexBuffer
      4 -> ConstantBuffer
      8 -> ShaderResource
      16 -> StreamOutput
      32 -> RenderTarget
      64 -> DepthStencil
      128 -> UnorderedAccess
      512 -> Decoder
      1024 -> VideoEncoder
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Direct3DBindings> {
    public fun setValue(newValue: Direct3DBindings): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Direct3DBindings =
        Direct3DBindings.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Direct3DBindings, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Direct3DBindings =
        Direct3DBindings.values()[0].fromNative(value, null)

    public override fun toNative(obj: Direct3DBindings): Int = obj.value
  }
}
