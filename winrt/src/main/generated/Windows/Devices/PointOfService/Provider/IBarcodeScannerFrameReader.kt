package Windows.Devices.PointOfService.Provider

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarcodeScannerFrameReader.ABI::class)
@Signature("{dbc72b07-64c3-482b-93c8-65fb33c22208}")
@Guid("dbc72b0764c3482b93c865fb33c22208")
@WinRTInterface("dbc72b0764c3482b93c865fb33c22208")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerFrameReader.ByReference::class)
public interface IBarcodeScannerFrameReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun StopAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun TryAcquireLatestFrameAsync(): IAsyncOperation<BarcodeScannerVideoFrame?>?

  @InterfaceMethod(3)
  public fun get_Connection(): BarcodeScannerProviderConnection?

  @InterfaceMethod(4)
  public fun add_FrameArrived(handler: TypedEventHandler<BarcodeScannerFrameReader?,
      BarcodeScannerFrameReaderFrameArrivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_FrameArrived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerFrameReader> {
    public override fun getValue() = ABI.makeIBarcodeScannerFrameReader(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerFrameReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerFrameReader {
    public val __2000198846_Ptr: Pointer?

    public val _2000198846_VtblPtr: Pointer?
      get() = __2000198846_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _2000198846_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2000198846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StopAsync(): IAsyncAction? {
      val fnPtr = _2000198846_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2000198846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryAcquireLatestFrameAsync(): IAsyncOperation<BarcodeScannerVideoFrame?>? {
      val fnPtr = _2000198846_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BarcodeScannerVideoFrame?>>()
      val hr = fn.invokeHR(arrayOf(__2000198846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<BarcodeScannerVideoFrame?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Connection(): BarcodeScannerProviderConnection? {
      val fnPtr = _2000198846_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__2000198846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerProviderConnection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_FrameArrived(handler: TypedEventHandler<BarcodeScannerFrameReader?,
        BarcodeScannerFrameReaderFrameArrivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2000198846_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2000198846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_FrameArrived(token: EventRegistrationToken?): Unit {
      val fnPtr = _2000198846_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000198846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBarcodeScannerFrameReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000198846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerFrameReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbc72b0764c3482b93c865fb33c22208")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerFrameReader(ptr: Pointer?): WithDefault =
        IBarcodeScannerFrameReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerFrameReader {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerFrameReader(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000198846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerFrameReader):
        Array<IBarcodeScannerFrameReader?> = (elements as
        Array<IBarcodeScannerFrameReader?>).castToImpl<IBarcodeScannerFrameReader,IBarcodeScannerFrameReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerFrameReader?> =
        arrayOfNulls<IBarcodeScannerFrameReader_Impl>(size) as Array<IBarcodeScannerFrameReader?>
  }
}
