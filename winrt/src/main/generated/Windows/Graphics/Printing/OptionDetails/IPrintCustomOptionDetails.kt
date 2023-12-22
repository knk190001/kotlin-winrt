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

@ABIMarker(IPrintCustomOptionDetails.ABI::class)
@Signature("{e32bde1c-28af-4b90-95da-a3acf320b929}")
@Guid("e32bde1c28af4b9095daa3acf320b929")
@WinRTInterface("e32bde1c28af4b9095daa3acf320b929")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintCustomOptionDetails.ByReference::class)
public interface IPrintCustomOptionDetails : NativeMapped, IWinRTInterface, IPrintOptionDetails {
  @InterfaceMethod(0)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintCustomOptionDetails> {
    public override fun getValue() = ABI.makeIPrintCustomOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintCustomOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintCustomOptionDetails, IPrintOptionDetails.WithDefault {
    public val __2747404_Ptr: Pointer?

    public val _2747404_VtblPtr: Pointer?
      get() = __2747404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _2747404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2747404_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _2747404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2747404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrintCustomOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPrintOptionDetails {
    public override val __143188995_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2747404_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2747404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintCustomOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e32bde1c28af4b9095daa3acf320b929")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintCustomOptionDetails(ptr: Pointer?): WithDefault =
        IPrintCustomOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintCustomOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintCustomOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintCustomOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2747404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintCustomOptionDetails):
        Array<IPrintCustomOptionDetails?> = (elements as
        Array<IPrintCustomOptionDetails?>).castToImpl<IPrintCustomOptionDetails,IPrintCustomOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintCustomOptionDetails?> =
        arrayOfNulls<IPrintCustomOptionDetails_Impl>(size) as Array<IPrintCustomOptionDetails?>
  }
}
