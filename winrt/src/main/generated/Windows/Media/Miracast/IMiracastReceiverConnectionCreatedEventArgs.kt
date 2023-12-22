package Windows.Media.Miracast

import Windows.Foundation.Deferral
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMiracastReceiverConnectionCreatedEventArgs.ABI::class)
@Signature("{7d8dfa39-307a-5c0f-94bd-d0c69d169982}")
@Guid("7d8dfa39307a5c0f94bdd0c69d169982")
@WinRTInterface("7d8dfa39307a5c0f94bdd0c69d169982")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverConnectionCreatedEventArgs.ByReference::class)
public interface IMiracastReceiverConnectionCreatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): MiracastReceiverConnection?

  @InterfaceMethod(1)
  public fun get_Pin(): String?

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverConnectionCreatedEventArgs> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverConnectionCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverConnectionCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverConnectionCreatedEventArgs {
    public val __892585040_Ptr: Pointer?

    public val _892585040_VtblPtr: Pointer?
      get() = __892585040_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): MiracastReceiverConnection? {
      val fnPtr = _892585040_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverConnection>()
      val hr = fn.invokeHR(arrayOf(__892585040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverConnection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Pin(): String? {
      val fnPtr = _892585040_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__892585040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _892585040_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__892585040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverConnectionCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __892585040_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverConnectionCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d8dfa39307a5c0f94bdd0c69d169982")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverConnectionCreatedEventArgs(ptr: Pointer?): WithDefault =
        IMiracastReceiverConnectionCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMiracastReceiverConnectionCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverConnectionCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverConnectionCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__892585040_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverConnectionCreatedEventArgs):
        Array<IMiracastReceiverConnectionCreatedEventArgs?> = (elements as
        Array<IMiracastReceiverConnectionCreatedEventArgs?>).castToImpl<IMiracastReceiverConnectionCreatedEventArgs,IMiracastReceiverConnectionCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverConnectionCreatedEventArgs?> =
        arrayOfNulls<IMiracastReceiverConnectionCreatedEventArgs_Impl>(size) as
        Array<IMiracastReceiverConnectionCreatedEventArgs?>
  }
}
