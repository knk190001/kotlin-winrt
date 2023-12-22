package Windows.UI.Xaml.Documents

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

@ABIMarker(IBlockStatics2.ABI::class)
@Signature("{af01a4d6-03e3-4cee-9b02-2bfc308b27a9}")
@Guid("af01a4d603e34cee9b022bfc308b27a9")
@WinRTInterface("af01a4d603e34cee9b022bfc308b27a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBlockStatics2.ByReference::class)
public interface IBlockStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalTextAlignmentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBlockStatics2>
      {
    public override fun getValue() = ABI.makeIBlockStatics2(pointer.getPointer(0))

    public fun setValue(value: IBlockStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBlockStatics2 {
    public val __1802088558_Ptr: Pointer?

    public val _1802088558_VtblPtr: Pointer?
      get() = __1802088558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalTextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1802088558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1802088558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBlockStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1802088558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBlockStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af01a4d603e34cee9b022bfc308b27a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBlockStatics2(ptr: Pointer?): WithDefault = IBlockStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBlockStatics2 {
      val address = segment.toRawLongValue()
      return makeIBlockStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBlockStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802088558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBlockStatics2): Array<IBlockStatics2?> = (elements as
        Array<IBlockStatics2?>).castToImpl<IBlockStatics2,IBlockStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBlockStatics2?> =
        arrayOfNulls<IBlockStatics2_Impl>(size) as Array<IBlockStatics2?>
  }
}
