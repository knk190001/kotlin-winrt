package Microsoft.Web.WebView2.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.jvm.JvmField

@ABIMarker(CoreWebView2PhysicalKeyStatus.ABI::class)
@Signature("struct(Microsoft.Web.WebView2.Core.CoreWebView2PhysicalKeyStatus;u4;u4;i4;i4;i4;i4)")
@Structure.FieldOrder("RepeatCount, ScanCode, IsExtendedKey, IsMenuKeyDown, WasKeyDown, IsKeyReleased")
@WinRTByReference(brClass = CoreWebView2PhysicalKeyStatus.ByReference::class)
public open class CoreWebView2PhysicalKeyStatus(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var RepeatCount: WinDef.UINT? = null

  @JvmField
  public var ScanCode: WinDef.UINT? = null

  @JvmField
  public var IsExtendedKey: Int? = null

  @JvmField
  public var IsMenuKeyDown: Int? = null

  @JvmField
  public var WasKeyDown: Int? = null

  @JvmField
  public var IsKeyReleased: Int? = null

  public class ByReference : CoreWebView2PhysicalKeyStatus(), Structure.ByReference,
      IByReference<CoreWebView2PhysicalKeyStatus> {
    public override fun getValue(): CoreWebView2PhysicalKeyStatus = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : CoreWebView2PhysicalKeyStatus(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(CoreWebView2PhysicalKeyStatus::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
    )


    public override fun fromNative(segment: MemorySegment): ByValue {
      val address = segment.address().toRawLongValue()
      return ByValue(Pointer(address))
    }

    public override fun toNative(obj: ByValue): MemorySegment {
      obj.write()
      val address  = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
      return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
    }
  }
}
