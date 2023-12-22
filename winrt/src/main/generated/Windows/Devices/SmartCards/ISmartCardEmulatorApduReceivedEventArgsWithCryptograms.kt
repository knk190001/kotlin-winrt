package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.ABI::class)
@Signature("{d550bac7-b7bf-4e29-9294-0c4ac3c941bd}")
@Guid("d550bac7b7bf4e2992940c4ac3c941bd")
@WinRTInterface("d550bac7b7bf4e2992940c4ac3c941bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.ByReference::class)
public interface ISmartCardEmulatorApduReceivedEventArgsWithCryptograms : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryRespondWithCryptogramsAsync(responseTemplate: IBuffer?,
      cryptogramPlacementSteps: IIterable<SmartCardCryptogramPlacementStep?>?):
      IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  @InterfaceMethod(1)
  public fun TryRespondWithCryptogramsAsync(
    responseTemplate: IBuffer?,
    cryptogramPlacementSteps: IIterable<SmartCardCryptogramPlacementStep?>?,
    nextState: IReference<WinDef.UINT>?
  ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms> {
    public override fun getValue() =
        ABI.makeISmartCardEmulatorApduReceivedEventArgsWithCryptograms(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorApduReceivedEventArgsWithCryptograms_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorApduReceivedEventArgsWithCryptograms {
    public val __583050822_Ptr: Pointer?

    public val _583050822_VtblPtr: Pointer?
      get() = __583050822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryRespondWithCryptogramsAsync(responseTemplate: IBuffer?,
        cryptogramPlacementSteps: IIterable<SmartCardCryptogramPlacementStep?>?):
        IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _583050822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__583050822_Ptr, marshalToNative(responseTemplate),
          marshalToNative(cryptogramPlacementSteps), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryRespondWithCryptogramsAsync(
      responseTemplate: IBuffer?,
      cryptogramPlacementSteps: IIterable<SmartCardCryptogramPlacementStep?>?,
      nextState: IReference<WinDef.UINT>?
    ): IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>? {
      val fnPtr = _583050822_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__583050822_Ptr, marshalToNative(responseTemplate),
          marshalToNative(cryptogramPlacementSteps), marshalToNative(nextState), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGeneratorOperationStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardEmulatorApduReceivedEventArgsWithCryptograms_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __583050822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d550bac7b7bf4e2992940c4ac3c941bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorApduReceivedEventArgsWithCryptograms(ptr: Pointer?):
        WithDefault = ISmartCardEmulatorApduReceivedEventArgsWithCryptograms_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardEmulatorApduReceivedEventArgsWithCryptograms {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorApduReceivedEventArgsWithCryptograms(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorApduReceivedEventArgsWithCryptograms):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__583050822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorApduReceivedEventArgsWithCryptograms):
        Array<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms?> = (elements as
        Array<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms?>).castToImpl<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms,ISmartCardEmulatorApduReceivedEventArgsWithCryptograms_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms?> =
        arrayOfNulls<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms_Impl>(size) as
        Array<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms?>
  }
}
