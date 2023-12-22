package Windows.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGravityConnectedAnimationConfiguration2.ABI::class)
@Signature("{62333add-aed4-5fed-95ff-d128acce8be4}")
@Guid("62333addaed45fed95ffd128acce8be4")
@WinRTInterface("62333addaed45fed95ffd128acce8be4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGravityConnectedAnimationConfiguration2.ByReference::class)
public interface IGravityConnectedAnimationConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsShadowEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGravityConnectedAnimationConfiguration2> {
    public override fun getValue() =
        ABI.makeIGravityConnectedAnimationConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IGravityConnectedAnimationConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGravityConnectedAnimationConfiguration2 {
    public val __918225663_Ptr: Pointer?

    public val _918225663_VtblPtr: Pointer?
      get() = __918225663_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsShadowEnabled(): Boolean {
      val fnPtr = _918225663_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__918225663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsShadowEnabled(value: Boolean): Unit {
      val fnPtr = _918225663_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918225663_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGravityConnectedAnimationConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918225663_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGravityConnectedAnimationConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62333addaed45fed95ffd128acce8be4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGravityConnectedAnimationConfiguration2(ptr: Pointer?): WithDefault =
        IGravityConnectedAnimationConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGravityConnectedAnimationConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIGravityConnectedAnimationConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IGravityConnectedAnimationConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918225663_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGravityConnectedAnimationConfiguration2):
        Array<IGravityConnectedAnimationConfiguration2?> = (elements as
        Array<IGravityConnectedAnimationConfiguration2?>).castToImpl<IGravityConnectedAnimationConfiguration2,IGravityConnectedAnimationConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGravityConnectedAnimationConfiguration2?> =
        arrayOfNulls<IGravityConnectedAnimationConfiguration2_Impl>(size) as
        Array<IGravityConnectedAnimationConfiguration2?>
  }
}
