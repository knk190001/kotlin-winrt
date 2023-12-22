package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardEmulatorStatics3.ABI::class)
@Signature("{59ea142a-9f09-43f5-8565-cfa8148e4cb2}")
@Guid("59ea142a9f0943f58565cfa8148e4cb2")
@WinRTInterface("59ea142a9f0943f58565cfa8148e4cb2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulatorStatics3.ByReference::class)
public interface ISmartCardEmulatorStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorStatics3> {
    public override fun getValue() = ABI.makeISmartCardEmulatorStatics3(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorStatics3 {
    public val __683345033_Ptr: Pointer?

    public val _683345033_VtblPtr: Pointer?
      get() = __683345033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _683345033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__683345033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmartCardEmulatorStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __683345033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59ea142a9f0943f58565cfa8148e4cb2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorStatics3(ptr: Pointer?): WithDefault =
        ISmartCardEmulatorStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardEmulatorStatics3 {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorStatics3(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__683345033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorStatics3):
        Array<ISmartCardEmulatorStatics3?> = (elements as
        Array<ISmartCardEmulatorStatics3?>).castToImpl<ISmartCardEmulatorStatics3,ISmartCardEmulatorStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulatorStatics3?> =
        arrayOfNulls<ISmartCardEmulatorStatics3_Impl>(size) as Array<ISmartCardEmulatorStatics3?>
  }
}
