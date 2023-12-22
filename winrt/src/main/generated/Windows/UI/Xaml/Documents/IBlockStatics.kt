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

@ABIMarker(IBlockStatics.ABI::class)
@Signature("{f86a8c34-8d18-4c53-aebd-91e610a5e010}")
@Guid("f86a8c348d184c53aebd91e610a5e010")
@WinRTInterface("f86a8c348d184c53aebd91e610a5e010")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBlockStatics.ByReference::class)
public interface IBlockStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LineHeightProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_LineStackingStrategyProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MarginProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBlockStatics>
      {
    public override fun getValue() = ABI.makeIBlockStatics(pointer.getPointer(0))

    public fun setValue(value: IBlockStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBlockStatics {
    public val __1582152544_Ptr: Pointer?

    public val _1582152544_VtblPtr: Pointer?
      get() = __1582152544_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1582152544_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1582152544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LineHeightProperty(): DependencyProperty? {
      val fnPtr = _1582152544_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1582152544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LineStackingStrategyProperty(): DependencyProperty? {
      val fnPtr = _1582152544_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1582152544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MarginProperty(): DependencyProperty? {
      val fnPtr = _1582152544_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1582152544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBlockStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1582152544_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBlockStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f86a8c348d184c53aebd91e610a5e010")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBlockStatics(ptr: Pointer?): WithDefault = IBlockStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBlockStatics {
      val address = segment.toRawLongValue()
      return makeIBlockStatics(Pointer(address))
    }

    public override fun toNative(obj: IBlockStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1582152544_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBlockStatics): Array<IBlockStatics?> = (elements as
        Array<IBlockStatics?>).castToImpl<IBlockStatics,IBlockStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBlockStatics?> =
        arrayOfNulls<IBlockStatics_Impl>(size) as Array<IBlockStatics?>
  }
}
