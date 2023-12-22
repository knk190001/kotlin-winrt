package Windows.Graphics.Printing.OptionDetails

import Windows.Foundation.Collections.IVectorView
import Windows.Graphics.Printing.OptionDetails.IPrintOptionDetails.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintItemListOptionDetails.ABI::class)
@Signature("{9a2257bf-fe61-43d8-a24f-a3f6ab7320e7}")
@Guid("9a2257bffe6143d8a24fa3f6ab7320e7")
@WinRTInterface("9a2257bffe6143d8a24fa3f6ab7320e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintItemListOptionDetails.ByReference::class)
public interface IPrintItemListOptionDetails : NativeMapped, IWinRTInterface, IPrintOptionDetails {
  @InterfaceMethod(0)
  public fun get_Items(): IVectorView<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintItemListOptionDetails> {
    public override fun getValue() = ABI.makeIPrintItemListOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintItemListOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintItemListOptionDetails, IPrintOptionDetails.WithDefault {
    public val __1989080788_Ptr: Pointer?

    public val _1989080788_VtblPtr: Pointer?
      get() = __1989080788_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVectorView<IUnknown?>? {
      val fnPtr = _1989080788_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1989080788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintItemListOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPrintOptionDetails {
    public override val __143188995_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1989080788_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1989080788_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintItemListOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a2257bffe6143d8a24fa3f6ab7320e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintItemListOptionDetails(ptr: Pointer?): WithDefault =
        IPrintItemListOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintItemListOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintItemListOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintItemListOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1989080788_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintItemListOptionDetails):
        Array<IPrintItemListOptionDetails?> = (elements as
        Array<IPrintItemListOptionDetails?>).castToImpl<IPrintItemListOptionDetails,IPrintItemListOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintItemListOptionDetails?> =
        arrayOfNulls<IPrintItemListOptionDetails_Impl>(size) as Array<IPrintItemListOptionDetails?>
  }
}
