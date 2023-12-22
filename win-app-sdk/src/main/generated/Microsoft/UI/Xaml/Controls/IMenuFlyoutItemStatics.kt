package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IMenuFlyoutItemStatics.ABI::class)
@Signature("{9d7953d6-e6a6-5154-91f4-67f4d6042a4f}")
@Guid("9d7953d6e6a6515491f467f4d6042a4f")
@WinRTInterface("9d7953d6e6a6515491f467f4d6042a4f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemStatics.ByReference::class)
public interface IMenuFlyoutItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CommandProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IconProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_KeyboardAcceleratorTextOverrideProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemStatics> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemStatics(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemStatics {
    public val __1709544143_Ptr: Pointer?

    public val _1709544143_VtblPtr: Pointer?
      get() = __1709544143_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _1709544143_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1709544143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CommandProperty(): DependencyProperty? {
      val fnPtr = _1709544143_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1709544143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CommandParameterProperty(): DependencyProperty? {
      val fnPtr = _1709544143_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1709544143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IconProperty(): DependencyProperty? {
      val fnPtr = _1709544143_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1709544143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_KeyboardAcceleratorTextOverrideProperty(): DependencyProperty? {
      val fnPtr = _1709544143_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1709544143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1709544143_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d7953d6e6a6515491f467f4d6042a4f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemStatics(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemStatics {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1709544143_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemStatics): Array<IMenuFlyoutItemStatics?> =
        (elements as
        Array<IMenuFlyoutItemStatics?>).castToImpl<IMenuFlyoutItemStatics,IMenuFlyoutItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemStatics?> =
        arrayOfNulls<IMenuFlyoutItemStatics_Impl>(size) as Array<IMenuFlyoutItemStatics?>
  }
}
