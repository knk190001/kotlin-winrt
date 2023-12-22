package Windows.Graphics.Printing.OptionDetails

import Windows.Graphics.Printing.OptionDetails.IPrintItemListOptionDetails.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPrintCustomItemListOptionDetails.ABI::class)
@Signature("{a5fafd88-58f2-4ebd-b90f-51e4f2944c5d}")
@Guid("a5fafd8858f24ebdb90f51e4f2944c5d")
@WinRTInterface("a5fafd8858f24ebdb90f51e4f2944c5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintCustomItemListOptionDetails.ByReference::class)
public interface IPrintCustomItemListOptionDetails : NativeMapped, IWinRTInterface,
    IPrintItemListOptionDetails, IPrintOptionDetails, IPrintCustomOptionDetails {
  @InterfaceMethod(0)
  public fun AddItem(itemId: String?, displayName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintCustomItemListOptionDetails> {
    public override fun getValue() =
        ABI.makeIPrintCustomItemListOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintCustomItemListOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintCustomItemListOptionDetails,
      IPrintItemListOptionDetails.WithDefault, IPrintOptionDetails.WithDefault,
      IPrintCustomOptionDetails.WithDefault {
    public val __173431355_Ptr: Pointer?

    public val _173431355_VtblPtr: Pointer?
      get() = __173431355_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddItem(itemId: String?, displayName: String?): Unit {
      val fnPtr = _173431355_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173431355_Ptr, marshalToNative(itemId),
          marshalToNative(displayName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintCustomItemListOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPrintItemListOptionDetails,
      IPrintOptionDetails, IPrintCustomOptionDetails {
    public override val __1989080788_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_173431355_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __143188995_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPrintOptionDetails.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_173431355_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2747404_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPrintCustomOptionDetails.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_173431355_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __173431355_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintCustomItemListOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5fafd8858f24ebdb90f51e4f2944c5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintCustomItemListOptionDetails(ptr: Pointer?): WithDefault =
        IPrintCustomItemListOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintCustomItemListOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintCustomItemListOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintCustomItemListOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__173431355_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintCustomItemListOptionDetails):
        Array<IPrintCustomItemListOptionDetails?> = (elements as
        Array<IPrintCustomItemListOptionDetails?>).castToImpl<IPrintCustomItemListOptionDetails,IPrintCustomItemListOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintCustomItemListOptionDetails?> =
        arrayOfNulls<IPrintCustomItemListOptionDetails_Impl>(size) as
        Array<IPrintCustomItemListOptionDetails?>
  }
}
