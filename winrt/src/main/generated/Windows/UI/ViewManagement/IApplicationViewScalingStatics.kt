package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewScalingStatics.ABI::class)
@Signature("{b08fecf0-b946-45c8-a5e3-71f5aa78f861}")
@Guid("b08fecf0b94645c8a5e371f5aa78f861")
@WinRTInterface("b08fecf0b94645c8a5e371f5aa78f861")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewScalingStatics.ByReference::class)
public interface IApplicationViewScalingStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisableLayoutScaling(): Boolean

  @InterfaceMethod(1)
  public fun TrySetDisableLayoutScaling(disableLayoutScaling: Boolean): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewScalingStatics> {
    public override fun getValue() = ABI.makeIApplicationViewScalingStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewScalingStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewScalingStatics {
    public val __1702639519_Ptr: Pointer?

    public val _1702639519_VtblPtr: Pointer?
      get() = __1702639519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisableLayoutScaling(): Boolean {
      val fnPtr = _1702639519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1702639519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TrySetDisableLayoutScaling(disableLayoutScaling: Boolean): Boolean {
      val fnPtr = _1702639519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1702639519_Ptr, disableLayoutScaling, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewScalingStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1702639519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewScalingStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b08fecf0b94645c8a5e371f5aa78f861")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewScalingStatics(ptr: Pointer?): WithDefault =
        IApplicationViewScalingStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewScalingStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationViewScalingStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewScalingStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1702639519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewScalingStatics):
        Array<IApplicationViewScalingStatics?> = (elements as
        Array<IApplicationViewScalingStatics?>).castToImpl<IApplicationViewScalingStatics,IApplicationViewScalingStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewScalingStatics?> =
        arrayOfNulls<IApplicationViewScalingStatics_Impl>(size) as
        Array<IApplicationViewScalingStatics?>
  }
}
