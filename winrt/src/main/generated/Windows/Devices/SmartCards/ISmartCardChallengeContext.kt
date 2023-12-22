package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISmartCardChallengeContext.ABI::class)
@Signature("{192a5319-c9c4-4947-81cc-44794a61ef91}")
@Guid("192a5319c9c4494781cc44794a61ef91")
@WinRTInterface("192a5319c9c4494781cc44794a61ef91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardChallengeContext.ByReference::class)
public interface ISmartCardChallengeContext : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Challenge(): IBuffer?

  @InterfaceMethod(1)
  public fun VerifyResponseAsync(response: IBuffer?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun ProvisionAsync(response: IBuffer?, formatCard: Boolean): IAsyncAction?

  @InterfaceMethod(3)
  public fun ProvisionAsync(
    response: IBuffer?,
    formatCard: Boolean,
    newCardId: com.sun.jna.platform.win32.Guid.GUID?
  ): IAsyncAction?

  @InterfaceMethod(4)
  public fun ChangeAdministrativeKeyAsync(response: IBuffer?, newAdministrativeKey: IBuffer?):
      IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardChallengeContext> {
    public override fun getValue() = ABI.makeISmartCardChallengeContext(pointer.getPointer(0))

    public fun setValue(value: ISmartCardChallengeContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardChallengeContext, IClosable.WithDefault {
    public val __1940650734_Ptr: Pointer?

    public val _1940650734_VtblPtr: Pointer?
      get() = __1940650734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Challenge(): IBuffer? {
      val fnPtr = _1940650734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1940650734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun VerifyResponseAsync(response: IBuffer?): IAsyncOperation<Boolean>? {
      val fnPtr = _1940650734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1940650734_Ptr, marshalToNative(response), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ProvisionAsync(response: IBuffer?, formatCard: Boolean): IAsyncAction? {
      val fnPtr = _1940650734_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1940650734_Ptr, marshalToNative(response), formatCard, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ProvisionAsync(
      response: IBuffer?,
      formatCard: Boolean,
      newCardId: com.sun.jna.platform.win32.Guid.GUID?
    ): IAsyncAction? {
      val fnPtr = _1940650734_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1940650734_Ptr, marshalToNative(response), formatCard,
          marshalToNative(newCardId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ChangeAdministrativeKeyAsync(response: IBuffer?,
        newAdministrativeKey: IBuffer?): IAsyncAction? {
      val fnPtr = _1940650734_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1940650734_Ptr, marshalToNative(response),
          marshalToNative(newAdministrativeKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardChallengeContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1940650734_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1940650734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardChallengeContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("192a5319c9c4494781cc44794a61ef91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardChallengeContext(ptr: Pointer?): WithDefault =
        ISmartCardChallengeContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardChallengeContext {
      val address = segment.toRawLongValue()
      return makeISmartCardChallengeContext(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardChallengeContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1940650734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardChallengeContext):
        Array<ISmartCardChallengeContext?> = (elements as
        Array<ISmartCardChallengeContext?>).castToImpl<ISmartCardChallengeContext,ISmartCardChallengeContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardChallengeContext?> =
        arrayOfNulls<ISmartCardChallengeContext_Impl>(size) as Array<ISmartCardChallengeContext?>
  }
}
