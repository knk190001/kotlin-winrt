package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynWatcherStoppedEventArgsFactory.ABI::class)
@Signature("{878fa5a8-2d50-47e1-904a-20bf0d48c782}")
@Guid("878fa5a82d5047e1904a20bf0d48c782")
@WinRTInterface("878fa5a82d5047e1904a20bf0d48c782")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynWatcherStoppedEventArgsFactory.ByReference::class)
public interface IAllJoynWatcherStoppedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(status: Int): AllJoynWatcherStoppedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynWatcherStoppedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynWatcherStoppedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynWatcherStoppedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynWatcherStoppedEventArgsFactory {
    public val __558455627_Ptr: Pointer?

    public val _558455627_VtblPtr: Pointer?
      get() = __558455627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(status: Int): AllJoynWatcherStoppedEventArgs? {
      val fnPtr = _558455627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynWatcherStoppedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__558455627_Ptr, status, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynWatcherStoppedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynWatcherStoppedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558455627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynWatcherStoppedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("878fa5a82d5047e1904a20bf0d48c782")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynWatcherStoppedEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynWatcherStoppedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynWatcherStoppedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynWatcherStoppedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynWatcherStoppedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558455627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynWatcherStoppedEventArgsFactory):
        Array<IAllJoynWatcherStoppedEventArgsFactory?> = (elements as
        Array<IAllJoynWatcherStoppedEventArgsFactory?>).castToImpl<IAllJoynWatcherStoppedEventArgsFactory,IAllJoynWatcherStoppedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynWatcherStoppedEventArgsFactory?> =
        arrayOfNulls<IAllJoynWatcherStoppedEventArgsFactory_Impl>(size) as
        Array<IAllJoynWatcherStoppedEventArgsFactory?>
  }
}
