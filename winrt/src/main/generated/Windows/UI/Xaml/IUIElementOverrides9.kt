package Windows.UI.Xaml

import Windows.UI.Composition.AnimationPropertyInfo
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElementOverrides9.ABI::class)
@Signature("{9a6e5973-6d63-54f2-90fa-62813b20b7b9}")
@Guid("9a6e59736d6354f290fa62813b20b7b9")
@WinRTInterface("9a6e59736d6354f290fa62813b20b7b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementOverrides9.ByReference::class)
public interface IUIElementOverrides9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PopulatePropertyInfoOverride(propertyName: String?,
      animationPropertyInfo: AnimationPropertyInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementOverrides9> {
    public override fun getValue() = ABI.makeIUIElementOverrides9(pointer.getPointer(0))

    public fun setValue(value: IUIElementOverrides9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementOverrides9 {
    public val __56859800_Ptr: Pointer?

    public val _56859800_VtblPtr: Pointer?
      get() = __56859800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PopulatePropertyInfoOverride(propertyName: String?,
        animationPropertyInfo: AnimationPropertyInfo?): Unit {
      val fnPtr = _56859800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56859800_Ptr, marshalToNative(propertyName),
          marshalToNative(animationPropertyInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementOverrides9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __56859800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementOverrides9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a6e59736d6354f290fa62813b20b7b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementOverrides9(ptr: Pointer?): WithDefault = IUIElementOverrides9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementOverrides9 {
      val address = segment.toRawLongValue()
      return makeIUIElementOverrides9(Pointer(address))
    }

    public override fun toNative(obj: IUIElementOverrides9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__56859800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementOverrides9): Array<IUIElementOverrides9?> =
        (elements as
        Array<IUIElementOverrides9?>).castToImpl<IUIElementOverrides9,IUIElementOverrides9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementOverrides9?> =
        arrayOfNulls<IUIElementOverrides9_Impl>(size) as Array<IUIElementOverrides9?>
  }
}
