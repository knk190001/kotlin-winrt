package Windows.Graphics.Printing.OptionDetails

import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

@ABIMarker(IPrintCustomItemListOptionDetails2.ABI::class)
@Signature("{c9d6353d-651c-4a39-906e-1091a1801bf1}")
@Guid("c9d6353d651c4a39906e1091a1801bf1")
@WinRTInterface("c9d6353d651c4a39906e1091a1801bf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintCustomItemListOptionDetails2.ByReference::class)
public interface IPrintCustomItemListOptionDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddItem(
    itemId: String?,
    displayName: String?,
    description: String?,
    icon: IRandomAccessStreamWithContentType?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintCustomItemListOptionDetails2> {
    public override fun getValue() =
        ABI.makeIPrintCustomItemListOptionDetails2(pointer.getPointer(0))

    public fun setValue(value: IPrintCustomItemListOptionDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintCustomItemListOptionDetails2 {
    public val __1081404759_Ptr: Pointer?

    public val _1081404759_VtblPtr: Pointer?
      get() = __1081404759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddItem(
      itemId: String?,
      displayName: String?,
      description: String?,
      icon: IRandomAccessStreamWithContentType?
    ): Unit {
      val fnPtr = _1081404759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081404759_Ptr, marshalToNative(itemId),
          marshalToNative(displayName), marshalToNative(description), marshalToNative(icon),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintCustomItemListOptionDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1081404759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintCustomItemListOptionDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9d6353d651c4a39906e1091a1801bf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintCustomItemListOptionDetails2(ptr: Pointer?): WithDefault =
        IPrintCustomItemListOptionDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintCustomItemListOptionDetails2 {
      val address = segment.toRawLongValue()
      return makeIPrintCustomItemListOptionDetails2(Pointer(address))
    }

    public override fun toNative(obj: IPrintCustomItemListOptionDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1081404759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintCustomItemListOptionDetails2):
        Array<IPrintCustomItemListOptionDetails2?> = (elements as
        Array<IPrintCustomItemListOptionDetails2?>).castToImpl<IPrintCustomItemListOptionDetails2,IPrintCustomItemListOptionDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintCustomItemListOptionDetails2?> =
        arrayOfNulls<IPrintCustomItemListOptionDetails2_Impl>(size) as
        Array<IPrintCustomItemListOptionDetails2?>
  }
}
