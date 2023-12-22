package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactCardOptions.ABI.IID
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IContactCardOptions2.ABI::class)
@Signature("{8f271ba0-d74b-4cc6-9f53-1b0eb5d1273c}")
@Guid("8f271ba0d74b4cc69f531b0eb5d1273c")
@WinRTInterface("8f271ba0d74b4cc69f531b0eb5d1273c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactCardOptions2.ByReference::class)
public interface IContactCardOptions2 : NativeMapped, IWinRTInterface, IContactCardOptions {
  @InterfaceMethod(0)
  public fun get_ServerSearchContactListIds(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactCardOptions2> {
    public override fun getValue() = ABI.makeIContactCardOptions2(pointer.getPointer(0))

    public fun setValue(value: IContactCardOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactCardOptions2, IContactCardOptions.WithDefault {
    public val __1196925016_Ptr: Pointer?

    public val _1196925016_VtblPtr: Pointer?
      get() = __1196925016_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerSearchContactListIds(): IVector<String?>? {
      val fnPtr = _1196925016_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1196925016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactCardOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactCardOptions {
    public override val __792673510_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1196925016_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1196925016_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactCardOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f271ba0d74b4cc69f531b0eb5d1273c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactCardOptions2(ptr: Pointer?): WithDefault = IContactCardOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactCardOptions2 {
      val address = segment.toRawLongValue()
      return makeIContactCardOptions2(Pointer(address))
    }

    public override fun toNative(obj: IContactCardOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1196925016_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactCardOptions2): Array<IContactCardOptions2?> =
        (elements as
        Array<IContactCardOptions2?>).castToImpl<IContactCardOptions2,IContactCardOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactCardOptions2?> =
        arrayOfNulls<IContactCardOptions2_Impl>(size) as Array<IContactCardOptions2?>
  }
}
