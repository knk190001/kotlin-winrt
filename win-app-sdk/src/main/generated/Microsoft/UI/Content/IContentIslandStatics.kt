package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Composition.Visual
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IContentIslandStatics.ABI::class)
@Signature("{7b9eb7cc-8c43-5e0a-ab23-ab48628fd223}")
@Guid("7b9eb7cc8c435e0aab23ab48628fd223")
@WinRTInterface("7b9eb7cc8c435e0aab23ab48628fd223")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIslandStatics.ByReference::class)
public interface IContentIslandStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(Root: Visual?): ContentIsland?

  @InterfaceMethod(1)
  public fun FindAllForCompositor(compositor: Compositor?): Array<ContentIsland?>?

  @InterfaceMethod(2)
  public fun FindAllForCurrentThread(): Array<ContentIsland?>?

  @InterfaceMethod(3)
  public fun GetByVisual(child: Visual?): ContentIsland?

  @InterfaceMethod(4)
  public fun GetFromId(id: WinDef.ULONG): ContentIsland?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIslandStatics> {
    public override fun getValue() = ABI.makeIContentIslandStatics(pointer.getPointer(0))

    public fun setValue(value: IContentIslandStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIslandStatics {
    public val __456208161_Ptr: Pointer?

    public val _456208161_VtblPtr: Pointer?
      get() = __456208161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(Root: Visual?): ContentIsland? {
      val fnPtr = _456208161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIsland>()
      val hr = fn.invokeHR(arrayOf(__456208161_Ptr, marshalToNative(Root), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIsland>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllForCompositor(compositor: Compositor?): Array<ContentIsland?>? {
      val fnPtr = _456208161_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<ContentIsland>()
      val hr = fn.invokeHR(arrayOf(__456208161_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAllForCurrentThread(): Array<ContentIsland?>? {
      val fnPtr = _456208161_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<ContentIsland>()
      val hr = fn.invokeHR(arrayOf(__456208161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetByVisual(child: Visual?): ContentIsland? {
      val fnPtr = _456208161_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIsland>()
      val hr = fn.invokeHR(arrayOf(__456208161_Ptr, marshalToNative(child), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIsland>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFromId(id: WinDef.ULONG): ContentIsland? {
      val fnPtr = _456208161_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIsland>()
      val hr = fn.invokeHR(arrayOf(__456208161_Ptr, id, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIsland>(result.getValue())
      return resultValue
    }
  }

  public class IContentIslandStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __456208161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIslandStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b9eb7cc8c435e0aab23ab48628fd223")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIslandStatics(ptr: Pointer?): WithDefault =
        IContentIslandStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIslandStatics {
      val address = segment.toRawLongValue()
      return makeIContentIslandStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentIslandStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__456208161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIslandStatics): Array<IContentIslandStatics?> =
        (elements as
        Array<IContentIslandStatics?>).castToImpl<IContentIslandStatics,IContentIslandStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIslandStatics?> =
        arrayOfNulls<IContentIslandStatics_Impl>(size) as Array<IContentIslandStatics?>
  }
}
