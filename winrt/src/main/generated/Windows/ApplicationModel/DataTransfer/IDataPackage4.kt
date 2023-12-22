package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDataPackage4.ABI::class)
@Signature("{13a24ec8-9382-536f-852a-3045e1b29a3b}")
@Guid("13a24ec89382536f852a3045e1b29a3b")
@WinRTInterface("13a24ec89382536f852a3045e1b29a3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackage4.ByReference::class)
public interface IDataPackage4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ShareCanceled(handler: TypedEventHandler<DataPackage?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ShareCanceled(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataPackage4>
      {
    public override fun getValue() = ABI.makeIDataPackage4(pointer.getPointer(0))

    public fun setValue(value: IDataPackage4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackage4 {
    public val __563545154_Ptr: Pointer?

    public val _563545154_VtblPtr: Pointer?
      get() = __563545154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ShareCanceled(handler: TypedEventHandler<DataPackage?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _563545154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__563545154_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ShareCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _563545154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563545154_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackage4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __563545154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackage4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13a24ec89382536f852a3045e1b29a3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackage4(ptr: Pointer?): WithDefault = IDataPackage4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackage4 {
      val address = segment.toRawLongValue()
      return makeIDataPackage4(Pointer(address))
    }

    public override fun toNative(obj: IDataPackage4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__563545154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackage4): Array<IDataPackage4?> = (elements as
        Array<IDataPackage4?>).castToImpl<IDataPackage4,IDataPackage4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackage4?> =
        arrayOfNulls<IDataPackage4_Impl>(size) as Array<IDataPackage4?>
  }
}
