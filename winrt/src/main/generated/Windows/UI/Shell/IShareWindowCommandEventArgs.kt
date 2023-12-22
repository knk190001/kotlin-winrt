package Windows.UI.Shell

import Windows.UI.WindowId
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

@ABIMarker(IShareWindowCommandEventArgs.ABI::class)
@Signature("{4578dc09-a523-5756-a995-e4feb991fff0}")
@Guid("4578dc09a5235756a995e4feb991fff0")
@WinRTInterface("4578dc09a5235756a995e4feb991fff0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareWindowCommandEventArgs.ByReference::class)
public interface IShareWindowCommandEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WindowId(): WindowId?

  @InterfaceMethod(1)
  public fun get_Command(): ShareWindowCommand?

  @InterfaceMethod(2)
  public fun put_Command(value: ShareWindowCommand?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareWindowCommandEventArgs> {
    public override fun getValue() = ABI.makeIShareWindowCommandEventArgs(pointer.getPointer(0))

    public fun setValue(value: IShareWindowCommandEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareWindowCommandEventArgs {
    public val __1790086707_Ptr: Pointer?

    public val _1790086707_VtblPtr: Pointer?
      get() = __1790086707_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowId(): WindowId? {
      val fnPtr = _1790086707_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__1790086707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Command(): ShareWindowCommand? {
      val fnPtr = _1790086707_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareWindowCommand>()
      val hr = fn.invokeHR(arrayOf(__1790086707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareWindowCommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Command(value: ShareWindowCommand?): Unit {
      val fnPtr = _1790086707_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1790086707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareWindowCommandEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1790086707_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareWindowCommandEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4578dc09a5235756a995e4feb991fff0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareWindowCommandEventArgs(ptr: Pointer?): WithDefault =
        IShareWindowCommandEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareWindowCommandEventArgs {
      val address = segment.toRawLongValue()
      return makeIShareWindowCommandEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IShareWindowCommandEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1790086707_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareWindowCommandEventArgs):
        Array<IShareWindowCommandEventArgs?> = (elements as
        Array<IShareWindowCommandEventArgs?>).castToImpl<IShareWindowCommandEventArgs,IShareWindowCommandEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareWindowCommandEventArgs?> =
        arrayOfNulls<IShareWindowCommandEventArgs_Impl>(size) as
        Array<IShareWindowCommandEventArgs?>
  }
}
