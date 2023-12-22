package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Rect
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

@ABIMarker(ICandidateWindowBoundsChangedEventArgs.ABI::class)
@Signature("{b76faf94-3172-5c50-9507-26cd873815a1}")
@Guid("b76faf9431725c50950726cd873815a1")
@WinRTInterface("b76faf9431725c50950726cd873815a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICandidateWindowBoundsChangedEventArgs.ByReference::class)
public interface ICandidateWindowBoundsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bounds(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICandidateWindowBoundsChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICandidateWindowBoundsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICandidateWindowBoundsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICandidateWindowBoundsChangedEventArgs {
    public val __565530396_Ptr: Pointer?

    public val _565530396_VtblPtr: Pointer?
      get() = __565530396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _565530396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__565530396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class ICandidateWindowBoundsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __565530396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICandidateWindowBoundsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b76faf9431725c50950726cd873815a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICandidateWindowBoundsChangedEventArgs(ptr: Pointer?): WithDefault =
        ICandidateWindowBoundsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICandidateWindowBoundsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICandidateWindowBoundsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICandidateWindowBoundsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__565530396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICandidateWindowBoundsChangedEventArgs):
        Array<ICandidateWindowBoundsChangedEventArgs?> = (elements as
        Array<ICandidateWindowBoundsChangedEventArgs?>).castToImpl<ICandidateWindowBoundsChangedEventArgs,ICandidateWindowBoundsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICandidateWindowBoundsChangedEventArgs?> =
        arrayOfNulls<ICandidateWindowBoundsChangedEventArgs_Impl>(size) as
        Array<ICandidateWindowBoundsChangedEventArgs?>
  }
}
