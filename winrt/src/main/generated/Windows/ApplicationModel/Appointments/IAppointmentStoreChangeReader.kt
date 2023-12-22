package Windows.ApplicationModel.Appointments

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAppointmentStoreChangeReader.ABI::class)
@Signature("{8b2409f1-65f3-42a0-961d-4c209bf30370}")
@Guid("8b2409f165f342a0961d4c209bf30370")
@WinRTInterface("8b2409f165f342a0961d4c209bf30370")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChangeReader.ByReference::class)
public interface IAppointmentStoreChangeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<AppointmentStoreChange?>?>?

  @InterfaceMethod(1)
  public fun AcceptChanges(): Unit

  @InterfaceMethod(2)
  public fun AcceptChangesThrough(lastChangeToAccept: AppointmentStoreChange?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChangeReader> {
    public override fun getValue() = ABI.makeIAppointmentStoreChangeReader(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChangeReader {
    public val __2114239840_Ptr: Pointer?

    public val _2114239840_VtblPtr: Pointer?
      get() = __2114239840_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<AppointmentStoreChange?>?>? {
      val fnPtr = _2114239840_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppointmentStoreChange?>?>>()
      val hr = fn.invokeHR(arrayOf(__2114239840_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppointmentStoreChange?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AcceptChanges(): Unit {
      val fnPtr = _2114239840_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2114239840_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AcceptChangesThrough(lastChangeToAccept: AppointmentStoreChange?): Unit {
      val fnPtr = _2114239840_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2114239840_Ptr, marshalToNative(lastChangeToAccept),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentStoreChangeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2114239840_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChangeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b2409f165f342a0961d4c209bf30370")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChangeReader(ptr: Pointer?): WithDefault =
        IAppointmentStoreChangeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChangeReader {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChangeReader(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2114239840_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChangeReader):
        Array<IAppointmentStoreChangeReader?> = (elements as
        Array<IAppointmentStoreChangeReader?>).castToImpl<IAppointmentStoreChangeReader,IAppointmentStoreChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChangeReader?> =
        arrayOfNulls<IAppointmentStoreChangeReader_Impl>(size) as
        Array<IAppointmentStoreChangeReader?>
  }
}
