package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointment2.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAppointment3.ABI::class)
@Signature("{bfcc45a9-8961-4991-934b-c48768e5a96c}")
@Guid("bfcc45a989614991934bc48768e5a96c")
@WinRTInterface("bfcc45a989614991934bc48768e5a96c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointment3.ByReference::class)
public interface IAppointment3 : NativeMapped, IWinRTInterface, IAppointment2, IAppointment {
  @InterfaceMethod(0)
  public fun get_ChangeNumber(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_RemoteChangeNumber(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun put_RemoteChangeNumber(value: WinDef.ULONG): Unit

  @InterfaceMethod(3)
  public fun get_DetailsKind(): AppointmentDetailsKind?

  @InterfaceMethod(4)
  public fun put_DetailsKind(value: AppointmentDetailsKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppointment3>
      {
    public override fun getValue() = ABI.makeIAppointment3(pointer.getPointer(0))

    public fun setValue(value: IAppointment3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointment3, IAppointment2.WithDefault, IAppointment.WithDefault
      {
    public val __477494687_Ptr: Pointer?

    public val _477494687_VtblPtr: Pointer?
      get() = __477494687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeNumber(): WinDef.ULONG {
      val fnPtr = _477494687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__477494687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_RemoteChangeNumber(): WinDef.ULONG {
      val fnPtr = _477494687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__477494687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_RemoteChangeNumber(value: WinDef.ULONG): Unit {
      val fnPtr = _477494687_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494687_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DetailsKind(): AppointmentDetailsKind? {
      val fnPtr = _477494687_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentDetailsKind>()
      val hr = fn.invokeHR(arrayOf(__477494687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentDetailsKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_DetailsKind(value: AppointmentDetailsKind?): Unit {
      val fnPtr = _477494687_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477494687_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointment3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointment2, IAppointment {
    public override val __477494686_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_477494687_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __815880940_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAppointment.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_477494687_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __477494687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointment3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfcc45a989614991934bc48768e5a96c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointment3(ptr: Pointer?): WithDefault = IAppointment3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointment3 {
      val address = segment.toRawLongValue()
      return makeIAppointment3(Pointer(address))
    }

    public override fun toNative(obj: IAppointment3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__477494687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointment3): Array<IAppointment3?> = (elements as
        Array<IAppointment3?>).castToImpl<IAppointment3,IAppointment3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointment3?> =
        arrayOfNulls<IAppointment3_Impl>(size) as Array<IAppointment3?>
  }
}
