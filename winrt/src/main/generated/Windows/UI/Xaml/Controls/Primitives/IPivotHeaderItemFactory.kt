package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPivotHeaderItemFactory.ABI::class)
@Signature("{14308b37-185b-4117-bc77-dda2eb261b99}")
@Guid("14308b37185b4117bc77dda2eb261b99")
@WinRTInterface("14308b37185b4117bc77dda2eb261b99")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotHeaderItemFactory.ByReference::class)
public interface IPivotHeaderItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PivotHeaderItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotHeaderItemFactory> {
    public override fun getValue() = ABI.makeIPivotHeaderItemFactory(pointer.getPointer(0))

    public fun setValue(value: IPivotHeaderItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotHeaderItemFactory {
    public val __369892196_Ptr: Pointer?

    public val _369892196_VtblPtr: Pointer?
      get() = __369892196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PivotHeaderItem? {
      val fnPtr = _369892196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotHeaderItem>()
      val hr = fn.invokeHR(arrayOf(__369892196_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotHeaderItem>(result.getValue())
      return resultValue
    }
  }

  public class IPivotHeaderItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __369892196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotHeaderItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14308b37185b4117bc77dda2eb261b99")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotHeaderItemFactory(ptr: Pointer?): WithDefault =
        IPivotHeaderItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotHeaderItemFactory {
      val address = segment.toRawLongValue()
      return makeIPivotHeaderItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IPivotHeaderItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369892196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotHeaderItemFactory): Array<IPivotHeaderItemFactory?>
        = (elements as
        Array<IPivotHeaderItemFactory?>).castToImpl<IPivotHeaderItemFactory,IPivotHeaderItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotHeaderItemFactory?> =
        arrayOfNulls<IPivotHeaderItemFactory_Impl>(size) as Array<IPivotHeaderItemFactory?>
  }
}
