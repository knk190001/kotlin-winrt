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

@ABIMarker(IJumpListItemBackgroundConverter.ABI::class)
@Signature("{81177858-d224-410c-b16c-c5b6bb6188b2}")
@Guid("81177858d224410cb16cc5b6bb6188b2")
@WinRTInterface("81177858d224410cb16cc5b6bb6188b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListItemBackgroundConverter.ByReference::class)
public interface IJumpListItemBackgroundConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Enabled(): Brush?

  @InterfaceMethod(1)
  public fun put_Enabled(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_Disabled(): Brush?

  @InterfaceMethod(3)
  public fun put_Disabled(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJumpListItemBackgroundConverter> {
    public override fun getValue() = ABI.makeIJumpListItemBackgroundConverter(pointer.getPointer(0))

    public fun setValue(value: IJumpListItemBackgroundConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListItemBackgroundConverter {
    public val __1997378583_Ptr: Pointer?

    public val _1997378583_VtblPtr: Pointer?
      get() = __1997378583_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Enabled(): Brush? {
      val fnPtr = _1997378583_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1997378583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Enabled(value: Brush?): Unit {
      val fnPtr = _1997378583_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1997378583_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Disabled(): Brush? {
      val fnPtr = _1997378583_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1997378583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Disabled(value: Brush?): Unit {
      val fnPtr = _1997378583_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1997378583_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IJumpListItemBackgroundConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1997378583_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListItemBackgroundConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81177858d224410cb16cc5b6bb6188b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListItemBackgroundConverter(ptr: Pointer?): WithDefault =
        IJumpListItemBackgroundConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJumpListItemBackgroundConverter {
      val address = segment.toRawLongValue()
      return makeIJumpListItemBackgroundConverter(Pointer(address))
    }

    public override fun toNative(obj: IJumpListItemBackgroundConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997378583_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListItemBackgroundConverter):
        Array<IJumpListItemBackgroundConverter?> = (elements as
        Array<IJumpListItemBackgroundConverter?>).castToImpl<IJumpListItemBackgroundConverter,IJumpListItemBackgroundConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListItemBackgroundConverter?> =
        arrayOfNulls<IJumpListItemBackgroundConverter_Impl>(size) as
        Array<IJumpListItemBackgroundConverter?>
  }
}
