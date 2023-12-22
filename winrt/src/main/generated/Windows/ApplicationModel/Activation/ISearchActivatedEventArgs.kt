package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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

@ABIMarker(ISearchActivatedEventArgs.ABI::class)
@Signature("{8cb36951-58c8-43e3-94bc-41d33f8b630e}")
@Guid("8cb3695158c843e394bc41d33f8b630e")
@WinRTInterface("8cb3695158c843e394bc41d33f8b630e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchActivatedEventArgs.ByReference::class)
public interface ISearchActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchActivatedEventArgs> {
    public override fun getValue() = ABI.makeISearchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1311408233_Ptr: Pointer?

    public val _1311408233_VtblPtr: Pointer?
      get() = __1311408233_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _1311408233_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1311408233_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _1311408233_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1311408233_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISearchActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1311408233_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1311408233_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cb3695158c843e394bc41d33f8b630e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchActivatedEventArgs(ptr: Pointer?): WithDefault =
        ISearchActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1311408233_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchActivatedEventArgs):
        Array<ISearchActivatedEventArgs?> = (elements as
        Array<ISearchActivatedEventArgs?>).castToImpl<ISearchActivatedEventArgs,ISearchActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchActivatedEventArgs?> =
        arrayOfNulls<ISearchActivatedEventArgs_Impl>(size) as Array<ISearchActivatedEventArgs?>
  }
}
