package Windows.Web.Syndication

import Windows.Web.Syndication.ISyndicationNode.ABI.IID
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

@ABIMarker(ISyndicationCategory.ABI::class)
@Signature("{8715626f-0cba-4a7f-89ff-ecb5281423b6}")
@Guid("8715626f0cba4a7f89ffecb5281423b6")
@WinRTInterface("8715626f0cba4a7f89ffecb5281423b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationCategory.ByReference::class)
public interface ISyndicationCategory : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Label(): String?

  @InterfaceMethod(1)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Scheme(): String?

  @InterfaceMethod(3)
  public fun put_Scheme(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Term(): String?

  @InterfaceMethod(5)
  public fun put_Term(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationCategory> {
    public override fun getValue() = ABI.makeISyndicationCategory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationCategory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationCategory, ISyndicationNode.WithDefault {
    public val __81156270_Ptr: Pointer?

    public val _81156270_VtblPtr: Pointer?
      get() = __81156270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _81156270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__81156270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _81156270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__81156270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Scheme(): String? {
      val fnPtr = _81156270_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__81156270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Scheme(value: String?): Unit {
      val fnPtr = _81156270_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__81156270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Term(): String? {
      val fnPtr = _81156270_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__81156270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Term(value: String?): Unit {
      val fnPtr = _81156270_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__81156270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationCategory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_81156270_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __81156270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationCategory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8715626f0cba4a7f89ffecb5281423b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationCategory(ptr: Pointer?): WithDefault = ISyndicationCategory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationCategory {
      val address = segment.toRawLongValue()
      return makeISyndicationCategory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationCategory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__81156270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationCategory): Array<ISyndicationCategory?> =
        (elements as
        Array<ISyndicationCategory?>).castToImpl<ISyndicationCategory,ISyndicationCategory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationCategory?> =
        arrayOfNulls<ISyndicationCategory_Impl>(size) as Array<ISyndicationCategory?>
  }
}
