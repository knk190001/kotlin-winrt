package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IToggleSwitchOverrides.ABI::class)
@Signature("{bfd07f53-f8ca-4e47-949e-9e80429b3d16}")
@Guid("bfd07f53f8ca4e47949e9e80429b3d16")
@WinRTInterface("bfd07f53f8ca4e47949e9e80429b3d16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSwitchOverrides.ByReference::class)
public interface IToggleSwitchOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnToggled(): Unit

  @InterfaceMethod(1)
  public fun OnOnContentChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun OnOffContentChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun OnHeaderChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSwitchOverrides> {
    public override fun getValue() = ABI.makeIToggleSwitchOverrides(pointer.getPointer(0))

    public fun setValue(value: IToggleSwitchOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSwitchOverrides {
    public val __1566742723_Ptr: Pointer?

    public val _1566742723_VtblPtr: Pointer?
      get() = __1566742723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnToggled(): Unit {
      val fnPtr = _1566742723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566742723_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnOnContentChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit {
      val fnPtr = _1566742723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566742723_Ptr, marshalToNative(oldContent),
          marshalToNative(newContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnOffContentChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit {
      val fnPtr = _1566742723_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566742723_Ptr, marshalToNative(oldContent),
          marshalToNative(newContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnHeaderChanged(oldContent: IUnknown?, newContent: IUnknown?): Unit {
      val fnPtr = _1566742723_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566742723_Ptr, marshalToNative(oldContent),
          marshalToNative(newContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToggleSwitchOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566742723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSwitchOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfd07f53f8ca4e47949e9e80429b3d16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSwitchOverrides(ptr: Pointer?): WithDefault =
        IToggleSwitchOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSwitchOverrides {
      val address = segment.toRawLongValue()
      return makeIToggleSwitchOverrides(Pointer(address))
    }

    public override fun toNative(obj: IToggleSwitchOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566742723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSwitchOverrides): Array<IToggleSwitchOverrides?> =
        (elements as
        Array<IToggleSwitchOverrides?>).castToImpl<IToggleSwitchOverrides,IToggleSwitchOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSwitchOverrides?> =
        arrayOfNulls<IToggleSwitchOverrides_Impl>(size) as Array<IToggleSwitchOverrides?>
  }
}
