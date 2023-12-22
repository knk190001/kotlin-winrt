package Windows.Networking.Connectivity

import Windows.Foundation.IReference
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectionProfileFilter3.ABI::class)
@Signature("{0aaa09c0-5014-447c-8809-aee4cb0af94a}")
@Guid("0aaa09c05014447c8809aee4cb0af94a")
@WinRTInterface("0aaa09c05014447c8809aee4cb0af94a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfileFilter3.ByReference::class)
public interface IConnectionProfileFilter3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_PurposeGuid(value: IReference<com.sun.jna.platform.win32.Guid.GUID?>?): Unit

  @InterfaceMethod(1)
  public fun get_PurposeGuid(): IReference<com.sun.jna.platform.win32.Guid.GUID?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfileFilter3> {
    public override fun getValue() = ABI.makeIConnectionProfileFilter3(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfileFilter3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfileFilter3 {
    public val __770495635_Ptr: Pointer?

    public val _770495635_VtblPtr: Pointer?
      get() = __770495635_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PurposeGuid(value: IReference<com.sun.jna.platform.win32.Guid.GUID?>?):
        Unit {
      val fnPtr = _770495635_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__770495635_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PurposeGuid(): IReference<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _770495635_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__770495635_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfileFilter3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __770495635_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfileFilter3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0aaa09c05014447c8809aee4cb0af94a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfileFilter3(ptr: Pointer?): WithDefault =
        IConnectionProfileFilter3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfileFilter3 {
      val address = segment.toRawLongValue()
      return makeIConnectionProfileFilter3(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfileFilter3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__770495635_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfileFilter3):
        Array<IConnectionProfileFilter3?> = (elements as
        Array<IConnectionProfileFilter3?>).castToImpl<IConnectionProfileFilter3,IConnectionProfileFilter3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfileFilter3?> =
        arrayOfNulls<IConnectionProfileFilter3_Impl>(size) as Array<IConnectionProfileFilter3?>
  }
}
