package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IDragItemThemeAnimation.ABI::class)
@Signature("{648e690e-a2c0-58ca-b15d-db6fccc663f2}")
@Guid("648e690ea2c058cab15ddb6fccc663f2")
@WinRTInterface("648e690ea2c058cab15ddb6fccc663f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragItemThemeAnimation.ByReference::class)
public interface IDragItemThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragItemThemeAnimation> {
    public override fun getValue() = ABI.makeIDragItemThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IDragItemThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragItemThemeAnimation {
    public val __1243633085_Ptr: Pointer?

    public val _1243633085_VtblPtr: Pointer?
      get() = __1243633085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _1243633085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1243633085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _1243633085_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1243633085_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDragItemThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1243633085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragItemThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("648e690ea2c058cab15ddb6fccc663f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragItemThemeAnimation(ptr: Pointer?): WithDefault =
        IDragItemThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragItemThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIDragItemThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IDragItemThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1243633085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragItemThemeAnimation): Array<IDragItemThemeAnimation?>
        = (elements as
        Array<IDragItemThemeAnimation?>).castToImpl<IDragItemThemeAnimation,IDragItemThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragItemThemeAnimation?> =
        arrayOfNulls<IDragItemThemeAnimation_Impl>(size) as Array<IDragItemThemeAnimation?>
  }
}
