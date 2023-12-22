package Windows.Graphics.Printing.OptionDetails

import Windows.Graphics.Printing.OptionDetails.IPrintCustomOptionDetails.ABI.IID
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

@ABIMarker(IPrintCustomTextOptionDetails.ABI::class)
@Signature("{2ad171f8-c8bd-4905-9192-0d75136e8b31}")
@Guid("2ad171f8c8bd490591920d75136e8b31")
@WinRTInterface("2ad171f8c8bd490591920d75136e8b31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintCustomTextOptionDetails.ByReference::class)
public interface IPrintCustomTextOptionDetails : NativeMapped, IWinRTInterface,
    IPrintCustomOptionDetails, IPrintOptionDetails {
  @InterfaceMethod(0)
  public fun put_MaxCharacters(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_MaxCharacters(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintCustomTextOptionDetails> {
    public override fun getValue() = ABI.makeIPrintCustomTextOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintCustomTextOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintCustomTextOptionDetails,
      IPrintCustomOptionDetails.WithDefault, IPrintOptionDetails.WithDefault {
    public val __1797607519_Ptr: Pointer?

    public val _1797607519_VtblPtr: Pointer?
      get() = __1797607519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_MaxCharacters(value: WinDef.UINT): Unit {
      val fnPtr = _1797607519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1797607519_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_MaxCharacters(): WinDef.UINT {
      val fnPtr = _1797607519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1797607519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintCustomTextOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPrintCustomOptionDetails,
      IPrintOptionDetails {
    public override val __2747404_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1797607519_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __143188995_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPrintOptionDetails.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1797607519_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1797607519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintCustomTextOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ad171f8c8bd490591920d75136e8b31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintCustomTextOptionDetails(ptr: Pointer?): WithDefault =
        IPrintCustomTextOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintCustomTextOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintCustomTextOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintCustomTextOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1797607519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintCustomTextOptionDetails):
        Array<IPrintCustomTextOptionDetails?> = (elements as
        Array<IPrintCustomTextOptionDetails?>).castToImpl<IPrintCustomTextOptionDetails,IPrintCustomTextOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintCustomTextOptionDetails?> =
        arrayOfNulls<IPrintCustomTextOptionDetails_Impl>(size) as
        Array<IPrintCustomTextOptionDetails?>
  }
}
