package Windows.UI.Xaml.Controls

import Windows.Foundation.TimeSpan
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

@ABIMarker(ITimePickedEventArgs.ABI::class)
@Signature("{8ad3ff21-5f66-4785-b999-24fef39fb6db}")
@Guid("8ad3ff215f664785b99924fef39fb6db")
@WinRTInterface("8ad3ff215f664785b99924fef39fb6db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickedEventArgs.ByReference::class)
public interface ITimePickedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_NewTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickedEventArgs> {
    public override fun getValue() = ABI.makeITimePickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITimePickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickedEventArgs {
    public val __384702002_Ptr: Pointer?

    public val _384702002_VtblPtr: Pointer?
      get() = __384702002_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldTime(): TimeSpan? {
      val fnPtr = _384702002_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__384702002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewTime(): TimeSpan? {
      val fnPtr = _384702002_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__384702002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __384702002_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ad3ff215f664785b99924fef39fb6db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickedEventArgs(ptr: Pointer?): WithDefault = ITimePickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickedEventArgs {
      val address = segment.toRawLongValue()
      return makeITimePickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITimePickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__384702002_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickedEventArgs): Array<ITimePickedEventArgs?> =
        (elements as
        Array<ITimePickedEventArgs?>).castToImpl<ITimePickedEventArgs,ITimePickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickedEventArgs?> =
        arrayOfNulls<ITimePickedEventArgs_Impl>(size) as Array<ITimePickedEventArgs?>
  }
}
