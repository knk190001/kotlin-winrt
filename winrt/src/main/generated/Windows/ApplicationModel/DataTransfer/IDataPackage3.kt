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

@ABIMarker(IDataPackage3.ABI::class)
@Signature("{88f31f5d-787b-4d32-965a-a9838105a056}")
@Guid("88f31f5d787b4d32965aa9838105a056")
@WinRTInterface("88f31f5d787b4d32965aa9838105a056")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackage3.ByReference::class)
public interface IDataPackage3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ShareCompleted(handler: TypedEventHandler<DataPackage?,
      ShareCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ShareCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataPackage3>
      {
    public override fun getValue() = ABI.makeIDataPackage3(pointer.getPointer(0))

    public fun setValue(value: IDataPackage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackage3 {
    public val __563545153_Ptr: Pointer?

    public val _563545153_VtblPtr: Pointer?
      get() = __563545153_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ShareCompleted(handler: TypedEventHandler<DataPackage?,
        ShareCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _563545153_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__563545153_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ShareCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _563545153_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563545153_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __563545153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88f31f5d787b4d32965aa9838105a056")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackage3(ptr: Pointer?): WithDefault = IDataPackage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackage3 {
      val address = segment.toRawLongValue()
      return makeIDataPackage3(Pointer(address))
    }

    public override fun toNative(obj: IDataPackage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__563545153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackage3): Array<IDataPackage3?> = (elements as
        Array<IDataPackage3?>).castToImpl<IDataPackage3,IDataPackage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackage3?> =
        arrayOfNulls<IDataPackage3_Impl>(size) as Array<IDataPackage3?>
  }
}
