package Windows.Networking.Proximity

import Windows.Networking.Sockets.StreamSocket
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

@ABIMarker(ITriggeredConnectionStateChangedEventArgs.ABI::class)
@Signature("{c6a780ad-f6e1-4d54-96e2-33f620bca88a}")
@Guid("c6a780adf6e14d5496e233f620bca88a")
@WinRTInterface("c6a780adf6e14d5496e233f620bca88a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITriggeredConnectionStateChangedEventArgs.ByReference::class)
public interface ITriggeredConnectionStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): TriggeredConnectState?

  @InterfaceMethod(1)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Socket(): StreamSocket?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITriggeredConnectionStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeITriggeredConnectionStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITriggeredConnectionStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITriggeredConnectionStateChangedEventArgs {
    public val __844576232_Ptr: Pointer?

    public val _844576232_VtblPtr: Pointer?
      get() = __844576232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): TriggeredConnectState? {
      val fnPtr = _844576232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TriggeredConnectState>()
      val hr = fn.invokeHR(arrayOf(__844576232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TriggeredConnectState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _844576232_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__844576232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Socket(): StreamSocket? {
      val fnPtr = _844576232_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocket>()
      val hr = fn.invokeHR(arrayOf(__844576232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocket>(result.getValue())
      return resultValue
    }
  }

  public class ITriggeredConnectionStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __844576232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITriggeredConnectionStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6a780adf6e14d5496e233f620bca88a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITriggeredConnectionStateChangedEventArgs(ptr: Pointer?): WithDefault =
        ITriggeredConnectionStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITriggeredConnectionStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITriggeredConnectionStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITriggeredConnectionStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__844576232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITriggeredConnectionStateChangedEventArgs):
        Array<ITriggeredConnectionStateChangedEventArgs?> = (elements as
        Array<ITriggeredConnectionStateChangedEventArgs?>).castToImpl<ITriggeredConnectionStateChangedEventArgs,ITriggeredConnectionStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITriggeredConnectionStateChangedEventArgs?> =
        arrayOfNulls<ITriggeredConnectionStateChangedEventArgs_Impl>(size) as
        Array<ITriggeredConnectionStateChangedEventArgs?>
  }
}
