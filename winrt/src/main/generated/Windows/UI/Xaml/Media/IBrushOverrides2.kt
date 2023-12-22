package Windows.UI.Xaml.Media

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

@ABIMarker(IBrushOverrides2.ABI::class)
@Signature("{d092b151-d83b-5a81-a71e-a1c7f8ad6963}")
@Guid("d092b151d83b5a81a71ea1c7f8ad6963")
@WinRTInterface("d092b151d83b5a81a71ea1c7f8ad6963")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrushOverrides2.ByReference::class)
public interface IBrushOverrides2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PopulatePropertyInfoOverride(propertyName: String?,
      animationPropertyInfo: AnimationPropertyInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrushOverrides2> {
    public override fun getValue() = ABI.makeIBrushOverrides2(pointer.getPointer(0))

    public fun setValue(value: IBrushOverrides2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrushOverrides2 {
    public val __996618167_Ptr: Pointer?

    public val _996618167_VtblPtr: Pointer?
      get() = __996618167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PopulatePropertyInfoOverride(propertyName: String?,
        animationPropertyInfo: AnimationPropertyInfo?): Unit {
      val fnPtr = _996618167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__996618167_Ptr, marshalToNative(propertyName),
          marshalToNative(animationPropertyInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBrushOverrides2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996618167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrushOverrides2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d092b151d83b5a81a71ea1c7f8ad6963")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrushOverrides2(ptr: Pointer?): WithDefault = IBrushOverrides2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrushOverrides2 {
      val address = segment.toRawLongValue()
      return makeIBrushOverrides2(Pointer(address))
    }

    public override fun toNative(obj: IBrushOverrides2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996618167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrushOverrides2): Array<IBrushOverrides2?> = (elements as
        Array<IBrushOverrides2?>).castToImpl<IBrushOverrides2,IBrushOverrides2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrushOverrides2?> =
        arrayOfNulls<IBrushOverrides2_Impl>(size) as Array<IBrushOverrides2?>
  }
}
