package Windows.UI.Xaml.Media

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

@ABIMarker(ITileBrush.ABI::class)
@Signature("{c201cf06-cd84-48a5-9607-664d7361cd61}")
@Guid("c201cf06cd8448a59607664d7361cd61")
@WinRTInterface("c201cf06cd8448a59607664d7361cd61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileBrush.ByReference::class)
public interface ITileBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlignmentX(): AlignmentX?

  @InterfaceMethod(1)
  public fun put_AlignmentX(value: AlignmentX?): Unit

  @InterfaceMethod(2)
  public fun get_AlignmentY(): AlignmentY?

  @InterfaceMethod(3)
  public fun put_AlignmentY(value: AlignmentY?): Unit

  @InterfaceMethod(4)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(5)
  public fun put_Stretch(value: Stretch?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITileBrush> {
    public override fun getValue() = ABI.makeITileBrush(pointer.getPointer(0))

    public fun setValue(value: ITileBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileBrush {
    public val __1922644656_Ptr: Pointer?

    public val _1922644656_VtblPtr: Pointer?
      get() = __1922644656_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlignmentX(): AlignmentX? {
      val fnPtr = _1922644656_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AlignmentX>()
      val hr = fn.invokeHR(arrayOf(__1922644656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AlignmentX>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AlignmentX(value: AlignmentX?): Unit {
      val fnPtr = _1922644656_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922644656_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AlignmentY(): AlignmentY? {
      val fnPtr = _1922644656_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AlignmentY>()
      val hr = fn.invokeHR(arrayOf(__1922644656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AlignmentY>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AlignmentY(value: AlignmentY?): Unit {
      val fnPtr = _1922644656_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922644656_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _1922644656_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__1922644656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _1922644656_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922644656_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITileBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1922644656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c201cf06cd8448a59607664d7361cd61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileBrush(ptr: Pointer?): WithDefault = ITileBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileBrush {
      val address = segment.toRawLongValue()
      return makeITileBrush(Pointer(address))
    }

    public override fun toNative(obj: ITileBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1922644656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileBrush): Array<ITileBrush?> = (elements as
        Array<ITileBrush?>).castToImpl<ITileBrush,ITileBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileBrush?> = arrayOfNulls<ITileBrush_Impl>(size)
        as Array<ITileBrush?>
  }
}
