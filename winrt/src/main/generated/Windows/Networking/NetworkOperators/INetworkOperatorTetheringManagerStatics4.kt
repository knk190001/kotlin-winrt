package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncAction
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

@ABIMarker(INetworkOperatorTetheringManagerStatics4.ABI::class)
@Signature("{b3b9f9d0-ebff-46a4-a847-d663d8b0977e}")
@Guid("b3b9f9d0ebff46a4a847d663d8b0977e")
@WinRTInterface("b3b9f9d0ebff46a4a847d663d8b0977e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringManagerStatics4.ByReference::class)
public interface INetworkOperatorTetheringManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsNoConnectionsTimeoutEnabled(): Boolean

  @InterfaceMethod(1)
  public fun EnableNoConnectionsTimeout(): Unit

  @InterfaceMethod(2)
  public fun EnableNoConnectionsTimeoutAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun DisableNoConnectionsTimeout(): Unit

  @InterfaceMethod(4)
  public fun DisableNoConnectionsTimeoutAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringManagerStatics4> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringManagerStatics4 {
    public val __15717851_Ptr: Pointer?

    public val _15717851_VtblPtr: Pointer?
      get() = __15717851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsNoConnectionsTimeoutEnabled(): Boolean {
      val fnPtr = _15717851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__15717851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun EnableNoConnectionsTimeout(): Unit {
      val fnPtr = _15717851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__15717851_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun EnableNoConnectionsTimeoutAsync(): IAsyncAction? {
      val fnPtr = _15717851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__15717851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DisableNoConnectionsTimeout(): Unit {
      val fnPtr = _15717851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__15717851_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun DisableNoConnectionsTimeoutAsync(): IAsyncAction? {
      val fnPtr = _15717851_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__15717851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __15717851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3b9f9d0ebff46a4a847d663d8b0977e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringManagerStatics4(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__15717851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringManagerStatics4):
        Array<INetworkOperatorTetheringManagerStatics4?> = (elements as
        Array<INetworkOperatorTetheringManagerStatics4?>).castToImpl<INetworkOperatorTetheringManagerStatics4,INetworkOperatorTetheringManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringManagerStatics4?> =
        arrayOfNulls<INetworkOperatorTetheringManagerStatics4_Impl>(size) as
        Array<INetworkOperatorTetheringManagerStatics4?>
  }
}
