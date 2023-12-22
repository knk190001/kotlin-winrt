package Windows.Media.Capture

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureMetadataWriter.ABI::class)
@Signature("{e0ce4877-9aaf-46b4-ad31-6a60b441c780}")
@Guid("e0ce48779aaf46b4ad316a60b441c780")
@WinRTInterface("e0ce48779aaf46b4ad316a60b441c780")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureMetadataWriter.ByReference::class)
public interface IAppCaptureMetadataWriter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddStringEvent(
    name: String?,
    value: String?,
    priority: AppCaptureMetadataPriority?
  ): Unit

  @InterfaceMethod(1)
  public fun AddInt32Event(
    name: String?,
    value: Int,
    priority: AppCaptureMetadataPriority?
  ): Unit

  @InterfaceMethod(2)
  public fun AddDoubleEvent(
    name: String?,
    value: Double,
    priority: AppCaptureMetadataPriority?
  ): Unit

  @InterfaceMethod(3)
  public fun StartStringState(
    name: String?,
    value: String?,
    priority: AppCaptureMetadataPriority?
  ): Unit

  @InterfaceMethod(4)
  public fun StartInt32State(
    name: String?,
    value: Int,
    priority: AppCaptureMetadataPriority?
  ): Unit

  @InterfaceMethod(5)
  public fun StartDoubleState(
    name: String?,
    value: Double,
    priority: AppCaptureMetadataPriority?
  ): Unit

  @InterfaceMethod(6)
  public fun StopState(name: String?): Unit

  @InterfaceMethod(7)
  public fun StopAllStates(): Unit

  @InterfaceMethod(8)
  public fun get_RemainingStorageBytesAvailable(): WinDef.ULONG

  @InterfaceMethod(9)
  public fun add_MetadataPurged(handler: TypedEventHandler<AppCaptureMetadataWriter?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_MetadataPurged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureMetadataWriter> {
    public override fun getValue() = ABI.makeIAppCaptureMetadataWriter(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureMetadataWriter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureMetadataWriter {
    public val __49909151_Ptr: Pointer?

    public val _49909151_VtblPtr: Pointer?
      get() = __49909151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddStringEvent(
      name: String?,
      value: String?,
      priority: AppCaptureMetadataPriority?
    ): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(priority),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AddInt32Event(
      name: String?,
      value: Int,
      priority: AppCaptureMetadataPriority?
    ): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name), value,
          marshalToNative(priority),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AddDoubleEvent(
      name: String?,
      value: Double,
      priority: AppCaptureMetadataPriority?
    ): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name), value,
          marshalToNative(priority),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun StartStringState(
      name: String?,
      value: String?,
      priority: AppCaptureMetadataPriority?
    ): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(priority),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun StartInt32State(
      name: String?,
      value: Int,
      priority: AppCaptureMetadataPriority?
    ): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name), value,
          marshalToNative(priority),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun StartDoubleState(
      name: String?,
      value: Double,
      priority: AppCaptureMetadataPriority?
    ): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name), value,
          marshalToNative(priority),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun StopState(name: String?): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun StopAllStates(): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RemainingStorageBytesAvailable(): WinDef.ULONG {
      val fnPtr = _49909151_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun add_MetadataPurged(handler: TypedEventHandler<AppCaptureMetadataWriter?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _49909151_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_MetadataPurged(token: EventRegistrationToken?): Unit {
      val fnPtr = _49909151_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__49909151_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppCaptureMetadataWriter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __49909151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureMetadataWriter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0ce48779aaf46b4ad316a60b441c780")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureMetadataWriter(ptr: Pointer?): WithDefault =
        IAppCaptureMetadataWriter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureMetadataWriter {
      val address = segment.toRawLongValue()
      return makeIAppCaptureMetadataWriter(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureMetadataWriter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__49909151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureMetadataWriter):
        Array<IAppCaptureMetadataWriter?> = (elements as
        Array<IAppCaptureMetadataWriter?>).castToImpl<IAppCaptureMetadataWriter,IAppCaptureMetadataWriter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureMetadataWriter?> =
        arrayOfNulls<IAppCaptureMetadataWriter_Impl>(size) as Array<IAppCaptureMetadataWriter?>
  }
}
