package Windows.UI.Xaml.Documents

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IParagraph.ABI::class)
@Signature("{f83ef59a-fa61-4bef-ae33-0b0ad756a84d}")
@Guid("f83ef59afa614befae330b0ad756a84d")
@WinRTInterface("f83ef59afa614befae330b0ad756a84d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IParagraph.ByReference::class)
public interface IParagraph : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Inlines(): InlineCollection?

  @InterfaceMethod(1)
  public fun get_TextIndent(): Double

  @InterfaceMethod(2)
  public fun put_TextIndent(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IParagraph> {
    public override fun getValue() = ABI.makeIParagraph(pointer.getPointer(0))

    public fun setValue(value: IParagraph_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IParagraph {
    public val __1187381178_Ptr: Pointer?

    public val _1187381178_VtblPtr: Pointer?
      get() = __1187381178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Inlines(): InlineCollection? {
      val fnPtr = _1187381178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InlineCollection>()
      val hr = fn.invokeHR(arrayOf(__1187381178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InlineCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextIndent(): Double {
      val fnPtr = _1187381178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1187381178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_TextIndent(value: Double): Unit {
      val fnPtr = _1187381178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1187381178_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IParagraph_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187381178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IParagraph, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f83ef59afa614befae330b0ad756a84d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIParagraph(ptr: Pointer?): WithDefault = IParagraph_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IParagraph {
      val address = segment.toRawLongValue()
      return makeIParagraph(Pointer(address))
    }

    public override fun toNative(obj: IParagraph): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187381178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IParagraph): Array<IParagraph?> = (elements as
        Array<IParagraph?>).castToImpl<IParagraph,IParagraph_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IParagraph?> = arrayOfNulls<IParagraph_Impl>(size)
        as Array<IParagraph?>
  }
}
