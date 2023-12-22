package Windows.Networking.Sockets

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebSocketClosedEventArgs.ABI::class)
@Signature("{ceb78d07-d0a8-4703-a091-c8c2c0915bc3}")
@Guid("ceb78d07d0a84703a091c8c2c0915bc3")
@WinRTInterface("ceb78d07d0a84703a091c8c2c0915bc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocketClosedEventArgs.ByReference::class)
public interface IWebSocketClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Code(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Reason(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebSocketClosedEventArgs> {
    public override fun getValue() = ABI.makeIWebSocketClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebSocketClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocketClosedEventArgs {
    public val __400648796_Ptr: Pointer?

    public val _400648796_VtblPtr: Pointer?
      get() = __400648796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Code(): WinDef.USHORT {
      val fnPtr = _400648796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__400648796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Reason(): String? {
      val fnPtr = _400648796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__400648796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebSocketClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __400648796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocketClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ceb78d07d0a84703a091c8c2c0915bc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocketClosedEventArgs(ptr: Pointer?): WithDefault =
        IWebSocketClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebSocketClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebSocketClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebSocketClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__400648796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocketClosedEventArgs):
        Array<IWebSocketClosedEventArgs?> = (elements as
        Array<IWebSocketClosedEventArgs?>).castToImpl<IWebSocketClosedEventArgs,IWebSocketClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebSocketClosedEventArgs?> =
        arrayOfNulls<IWebSocketClosedEventArgs_Impl>(size) as Array<IWebSocketClosedEventArgs?>
  }
}
