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

@ABIMarker(IDataTransferManager.ABI::class)
@Signature("{a5caee9b-8708-49d1-8d36-67d25a8da00c}")
@Guid("a5caee9b870849d18d3667d25a8da00c")
@WinRTInterface("a5caee9b870849d18d3667d25a8da00c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTransferManager.ByReference::class)
public interface IDataTransferManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_DataRequested(handler: TypedEventHandler<DataTransferManager?,
      DataRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_DataRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_TargetApplicationChosen(handler: TypedEventHandler<DataTransferManager?,
      TargetApplicationChosenEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_TargetApplicationChosen(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTransferManager> {
    public override fun getValue() = ABI.makeIDataTransferManager(pointer.getPointer(0))

    public fun setValue(value: IDataTransferManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTransferManager {
    public val __1708565294_Ptr: Pointer?

    public val _1708565294_VtblPtr: Pointer?
      get() = __1708565294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_DataRequested(handler: TypedEventHandler<DataTransferManager?,
        DataRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1708565294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1708565294_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_DataRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1708565294_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1708565294_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_TargetApplicationChosen(handler: TypedEventHandler<DataTransferManager?,
        TargetApplicationChosenEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1708565294_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1708565294_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_TargetApplicationChosen(token: EventRegistrationToken?): Unit {
      val fnPtr = _1708565294_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1708565294_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataTransferManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1708565294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTransferManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5caee9b870849d18d3667d25a8da00c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTransferManager(ptr: Pointer?): WithDefault = IDataTransferManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTransferManager {
      val address = segment.toRawLongValue()
      return makeIDataTransferManager(Pointer(address))
    }

    public override fun toNative(obj: IDataTransferManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1708565294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTransferManager): Array<IDataTransferManager?> =
        (elements as
        Array<IDataTransferManager?>).castToImpl<IDataTransferManager,IDataTransferManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTransferManager?> =
        arrayOfNulls<IDataTransferManager_Impl>(size) as Array<IDataTransferManager?>
  }
}
