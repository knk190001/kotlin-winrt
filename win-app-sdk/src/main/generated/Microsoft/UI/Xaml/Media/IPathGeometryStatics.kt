package Microsoft.UI.Xaml.Media

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

@ABIMarker(IPathGeometryStatics.ABI::class)
@Signature("{d7f408fe-6c3a-5cce-91cc-c5a95d4b345a}")
@Guid("d7f408fe6c3a5cce91ccc5a95d4b345a")
@WinRTInterface("d7f408fe6c3a5cce91ccc5a95d4b345a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathGeometryStatics.ByReference::class)
public interface IPathGeometryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillRuleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FiguresProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathGeometryStatics> {
    public override fun getValue() = ABI.makeIPathGeometryStatics(pointer.getPointer(0))

    public fun setValue(value: IPathGeometryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathGeometryStatics {
    public val __479035453_Ptr: Pointer?

    public val _479035453_VtblPtr: Pointer?
      get() = __479035453_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillRuleProperty(): DependencyProperty? {
      val fnPtr = _479035453_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__479035453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FiguresProperty(): DependencyProperty? {
      val fnPtr = _479035453_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__479035453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPathGeometryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479035453_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathGeometryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7f408fe6c3a5cce91ccc5a95d4b345a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathGeometryStatics(ptr: Pointer?): WithDefault = IPathGeometryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathGeometryStatics {
      val address = segment.toRawLongValue()
      return makeIPathGeometryStatics(Pointer(address))
    }

    public override fun toNative(obj: IPathGeometryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479035453_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathGeometryStatics): Array<IPathGeometryStatics?> =
        (elements as
        Array<IPathGeometryStatics?>).castToImpl<IPathGeometryStatics,IPathGeometryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathGeometryStatics?> =
        arrayOfNulls<IPathGeometryStatics_Impl>(size) as Array<IPathGeometryStatics?>
  }
}
