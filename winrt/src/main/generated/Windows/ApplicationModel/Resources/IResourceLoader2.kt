package Windows.ApplicationModel.Resources

import Windows.Foundation.Uri
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

@ABIMarker(IResourceLoader2.ABI::class)
@Signature("{10eb6ec6-8138-48c1-bc65-e1f14207367c}")
@Guid("10eb6ec6813848c1bc65e1f14207367c")
@WinRTInterface("10eb6ec6813848c1bc65e1f14207367c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceLoader2.ByReference::class)
public interface IResourceLoader2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStringForUri(uri: Uri?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceLoader2> {
    public override fun getValue() = ABI.makeIResourceLoader2(pointer.getPointer(0))

    public fun setValue(value: IResourceLoader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceLoader2 {
    public val __1897433693_Ptr: Pointer?

    public val _1897433693_VtblPtr: Pointer?
      get() = __1897433693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStringForUri(uri: Uri?): String? {
      val fnPtr = _1897433693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1897433693_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IResourceLoader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1897433693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceLoader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10eb6ec6813848c1bc65e1f14207367c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceLoader2(ptr: Pointer?): WithDefault = IResourceLoader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceLoader2 {
      val address = segment.toRawLongValue()
      return makeIResourceLoader2(Pointer(address))
    }

    public override fun toNative(obj: IResourceLoader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1897433693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceLoader2): Array<IResourceLoader2?> = (elements as
        Array<IResourceLoader2?>).castToImpl<IResourceLoader2,IResourceLoader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceLoader2?> =
        arrayOfNulls<IResourceLoader2_Impl>(size) as Array<IResourceLoader2?>
  }
}
