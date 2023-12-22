package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapElementStatics.ABI::class)
@Signature("{e8c71cf2-bfef-4b49-8e99-41b5e3789fd2}")
@Guid("e8c71cf2bfef4b498e9941b5e3789fd2")
@WinRTInterface("e8c71cf2bfef4b498e9941b5e3789fd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementStatics.ByReference::class)
public interface IMapElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ZIndexProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_VisibleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementStatics> {
    public override fun getValue() = ABI.makeIMapElementStatics(pointer.getPointer(0))

    public fun setValue(value: IMapElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementStatics {
    public val __629646452_Ptr: Pointer?

    public val _629646452_VtblPtr: Pointer?
      get() = __629646452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ZIndexProperty(): DependencyProperty? {
      val fnPtr = _629646452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__629646452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VisibleProperty(): DependencyProperty? {
      val fnPtr = _629646452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__629646452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629646452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8c71cf2bfef4b498e9941b5e3789fd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementStatics(ptr: Pointer?): WithDefault = IMapElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementStatics {
      val address = segment.toRawLongValue()
      return makeIMapElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629646452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementStatics): Array<IMapElementStatics?> =
        (elements as
        Array<IMapElementStatics?>).castToImpl<IMapElementStatics,IMapElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementStatics?> =
        arrayOfNulls<IMapElementStatics_Impl>(size) as Array<IMapElementStatics?>
  }
}
