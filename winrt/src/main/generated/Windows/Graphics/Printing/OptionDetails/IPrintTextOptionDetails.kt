package Windows.Graphics.Printing.OptionDetails

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPrintTextOptionDetails.ABI::class)
@Signature("{ad75e563-5ce4-46bc-9918-ab9fad144c5b}")
@Guid("ad75e5635ce446bc9918ab9fad144c5b")
@WinRTInterface("ad75e5635ce446bc9918ab9fad144c5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTextOptionDetails.ByReference::class)
public interface IPrintTextOptionDetails : NativeMapped, IWinRTInterface, IPrintOptionDetails {
  @InterfaceMethod(0)
  public fun get_MaxCharacters(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTextOptionDetails> {
    public override fun getValue() = ABI.makeIPrintTextOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintTextOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTextOptionDetails, IPrintOptionDetails.WithDefault {
    public val __1752752176_Ptr: Pointer?

    public val _1752752176_VtblPtr: Pointer?
      get() = __1752752176_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxCharacters(): WinDef.UINT {
      val fnPtr = _1752752176_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1752752176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintTextOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPrintOptionDetails {
    public override val __143188995_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1752752176_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1752752176_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTextOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad75e5635ce446bc9918ab9fad144c5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTextOptionDetails(ptr: Pointer?): WithDefault =
        IPrintTextOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTextOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintTextOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintTextOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1752752176_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTextOptionDetails): Array<IPrintTextOptionDetails?>
        = (elements as
        Array<IPrintTextOptionDetails?>).castToImpl<IPrintTextOptionDetails,IPrintTextOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTextOptionDetails?> =
        arrayOfNulls<IPrintTextOptionDetails_Impl>(size) as Array<IPrintTextOptionDetails?>
  }
}
