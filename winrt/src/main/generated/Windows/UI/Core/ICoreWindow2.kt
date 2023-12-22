package Windows.UI.Core

import Windows.Foundation.Point
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

@ABIMarker(ICoreWindow2.ABI::class)
@Signature("{7c2b1b85-6917-4361-9c02-0d9e3a420b95}")
@Guid("7c2b1b85691743619c020d9e3a420b95")
@WinRTInterface("7c2b1b85691743619c020d9e3a420b95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindow2.ByReference::class)
public interface ICoreWindow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_PointerPosition(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreWindow2> {
    public override fun getValue() = ABI.makeICoreWindow2(pointer.getPointer(0))

    public fun setValue(value: ICoreWindow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindow2 {
    public val __1001563416_Ptr: Pointer?

    public val _1001563416_VtblPtr: Pointer?
      get() = __1001563416_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PointerPosition(value: Point?): Unit {
      val fnPtr = _1001563416_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1001563416_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWindow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1001563416_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c2b1b85691743619c020d9e3a420b95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindow2(ptr: Pointer?): WithDefault = ICoreWindow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindow2 {
      val address = segment.toRawLongValue()
      return makeICoreWindow2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1001563416_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindow2): Array<ICoreWindow2?> = (elements as
        Array<ICoreWindow2?>).castToImpl<ICoreWindow2,ICoreWindow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindow2?> =
        arrayOfNulls<ICoreWindow2_Impl>(size) as Array<ICoreWindow2?>
  }
}
