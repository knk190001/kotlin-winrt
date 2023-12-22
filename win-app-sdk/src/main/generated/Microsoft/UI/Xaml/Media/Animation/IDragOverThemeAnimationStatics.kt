package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IDragOverThemeAnimationStatics.ABI::class)
@Signature("{8301afd2-68b2-5c6c-aadf-9a98d620e8d2}")
@Guid("8301afd268b25c6caadf9a98d620e8d2")
@WinRTInterface("8301afd268b25c6caadf9a98d620e8d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragOverThemeAnimationStatics.ByReference::class)
public interface IDragOverThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ToOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DirectionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragOverThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIDragOverThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IDragOverThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragOverThemeAnimationStatics {
    public val __720000039_Ptr: Pointer?

    public val _720000039_VtblPtr: Pointer?
      get() = __720000039_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _720000039_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__720000039_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ToOffsetProperty(): DependencyProperty? {
      val fnPtr = _720000039_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__720000039_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DirectionProperty(): DependencyProperty? {
      val fnPtr = _720000039_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__720000039_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDragOverThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __720000039_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragOverThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8301afd268b25c6caadf9a98d620e8d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragOverThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IDragOverThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragOverThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIDragOverThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDragOverThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__720000039_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragOverThemeAnimationStatics):
        Array<IDragOverThemeAnimationStatics?> = (elements as
        Array<IDragOverThemeAnimationStatics?>).castToImpl<IDragOverThemeAnimationStatics,IDragOverThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragOverThemeAnimationStatics?> =
        arrayOfNulls<IDragOverThemeAnimationStatics_Impl>(size) as
        Array<IDragOverThemeAnimationStatics?>
  }
}
