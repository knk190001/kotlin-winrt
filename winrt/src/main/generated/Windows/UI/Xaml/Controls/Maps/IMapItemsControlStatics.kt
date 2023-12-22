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

@ABIMarker(IMapItemsControlStatics.ABI::class)
@Signature("{33a859c7-789b-425c-8a0a-32385896cb4a}")
@Guid("33a859c7789b425c8a0a32385896cb4a")
@WinRTInterface("33a859c7789b425c8a0a32385896cb4a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapItemsControlStatics.ByReference::class)
public interface IMapItemsControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapItemsControlStatics> {
    public override fun getValue() = ABI.makeIMapItemsControlStatics(pointer.getPointer(0))

    public fun setValue(value: IMapItemsControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapItemsControlStatics {
    public val __1748886755_Ptr: Pointer?

    public val _1748886755_VtblPtr: Pointer?
      get() = __1748886755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _1748886755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1748886755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemsProperty(): DependencyProperty? {
      val fnPtr = _1748886755_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1748886755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _1748886755_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1748886755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapItemsControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1748886755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapItemsControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33a859c7789b425c8a0a32385896cb4a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapItemsControlStatics(ptr: Pointer?): WithDefault =
        IMapItemsControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapItemsControlStatics {
      val address = segment.toRawLongValue()
      return makeIMapItemsControlStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapItemsControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1748886755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapItemsControlStatics): Array<IMapItemsControlStatics?>
        = (elements as
        Array<IMapItemsControlStatics?>).castToImpl<IMapItemsControlStatics,IMapItemsControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapItemsControlStatics?> =
        arrayOfNulls<IMapItemsControlStatics_Impl>(size) as Array<IMapItemsControlStatics?>
  }
}
