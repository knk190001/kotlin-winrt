package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IJumpListItemForegroundConverter.ABI::class)
@Signature("{1590ed38-c504-4796-a63a-5bfc9eefaae8}")
@Guid("1590ed38c5044796a63a5bfc9eefaae8")
@WinRTInterface("1590ed38c5044796a63a5bfc9eefaae8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListItemForegroundConverter.ByReference::class)
public interface IJumpListItemForegroundConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Enabled(): Brush?

  @InterfaceMethod(1)
  public fun put_Enabled(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_Disabled(): Brush?

  @InterfaceMethod(3)
  public fun put_Disabled(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJumpListItemForegroundConverter> {
    public override fun getValue() = ABI.makeIJumpListItemForegroundConverter(pointer.getPointer(0))

    public fun setValue(value: IJumpListItemForegroundConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListItemForegroundConverter {
    public val __566605918_Ptr: Pointer?

    public val _566605918_VtblPtr: Pointer?
      get() = __566605918_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Enabled(): Brush? {
      val fnPtr = _566605918_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__566605918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Enabled(value: Brush?): Unit {
      val fnPtr = _566605918_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__566605918_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Disabled(): Brush? {
      val fnPtr = _566605918_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__566605918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Disabled(value: Brush?): Unit {
      val fnPtr = _566605918_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__566605918_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IJumpListItemForegroundConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __566605918_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListItemForegroundConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1590ed38c5044796a63a5bfc9eefaae8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListItemForegroundConverter(ptr: Pointer?): WithDefault =
        IJumpListItemForegroundConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJumpListItemForegroundConverter {
      val address = segment.toRawLongValue()
      return makeIJumpListItemForegroundConverter(Pointer(address))
    }

    public override fun toNative(obj: IJumpListItemForegroundConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__566605918_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListItemForegroundConverter):
        Array<IJumpListItemForegroundConverter?> = (elements as
        Array<IJumpListItemForegroundConverter?>).castToImpl<IJumpListItemForegroundConverter,IJumpListItemForegroundConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListItemForegroundConverter?> =
        arrayOfNulls<IJumpListItemForegroundConverter_Impl>(size) as
        Array<IJumpListItemForegroundConverter?>
  }
}
