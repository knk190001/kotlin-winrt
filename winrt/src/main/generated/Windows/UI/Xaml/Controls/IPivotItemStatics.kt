package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IPivotItemStatics.ABI::class)
@Signature("{e147ad0c-488b-4a6e-becd-a5dbd9941754}")
@Guid("e147ad0c488b4a6ebecda5dbd9941754")
@WinRTInterface("e147ad0c488b4a6ebecda5dbd9941754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotItemStatics.ByReference::class)
public interface IPivotItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotItemStatics> {
    public override fun getValue() = ABI.makeIPivotItemStatics(pointer.getPointer(0))

    public fun setValue(value: IPivotItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotItemStatics {
    public val __189353044_Ptr: Pointer?

    public val _189353044_VtblPtr: Pointer?
      get() = __189353044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _189353044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__189353044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPivotItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __189353044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e147ad0c488b4a6ebecda5dbd9941754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemStatics(ptr: Pointer?): WithDefault = IPivotItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemStatics {
      val address = segment.toRawLongValue()
      return makeIPivotItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__189353044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemStatics): Array<IPivotItemStatics?> = (elements
        as Array<IPivotItemStatics?>).castToImpl<IPivotItemStatics,IPivotItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemStatics?> =
        arrayOfNulls<IPivotItemStatics_Impl>(size) as Array<IPivotItemStatics?>
  }
}
