package Windows.UI.Xaml.Automation.Provider

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

@ABIMarker(IGridItemProvider.ABI::class)
@Signature("{fff3683c-7407-45bb-a936-df3ed6d3837d}")
@Guid("fff3683c740745bba936df3ed6d3837d")
@WinRTInterface("fff3683c740745bba936df3ed6d3837d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridItemProvider.ByReference::class)
public interface IGridItemProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Column(): Int

  @InterfaceMethod(1)
  public fun get_ColumnSpan(): Int

  @InterfaceMethod(2)
  public fun get_ContainingGrid(): IRawElementProviderSimple?

  @InterfaceMethod(3)
  public fun get_Row(): Int

  @InterfaceMethod(4)
  public fun get_RowSpan(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridItemProvider> {
    public override fun getValue() = ABI.makeIGridItemProvider(pointer.getPointer(0))

    public fun setValue(value: IGridItemProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridItemProvider {
    public val __1480602018_Ptr: Pointer?

    public val _1480602018_VtblPtr: Pointer?
      get() = __1480602018_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Column(): Int {
      val fnPtr = _1480602018_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1480602018_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ColumnSpan(): Int {
      val fnPtr = _1480602018_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1480602018_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ContainingGrid(): IRawElementProviderSimple? {
      val fnPtr = _1480602018_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1480602018_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Row(): Int {
      val fnPtr = _1480602018_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1480602018_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_RowSpan(): Int {
      val fnPtr = _1480602018_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1480602018_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IGridItemProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1480602018_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridItemProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fff3683c740745bba936df3ed6d3837d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridItemProvider(ptr: Pointer?): WithDefault = IGridItemProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridItemProvider {
      val address = segment.toRawLongValue()
      return makeIGridItemProvider(Pointer(address))
    }

    public override fun toNative(obj: IGridItemProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1480602018_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridItemProvider): Array<IGridItemProvider?> = (elements
        as Array<IGridItemProvider?>).castToImpl<IGridItemProvider,IGridItemProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridItemProvider?> =
        arrayOfNulls<IGridItemProvider_Impl>(size) as Array<IGridItemProvider?>
  }
}
