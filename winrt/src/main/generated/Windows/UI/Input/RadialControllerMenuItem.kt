package Windows.UI.Input

import Windows.Foundation.Uri
import Windows.Storage.Streams.RandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RadialControllerMenuItem.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerMenuItem;{c80fc98d-ad0b-4c9c-8f2f-136a2373a6ba})")
@WinRTByReference(brClass = RadialControllerMenuItem.ByReference::class)
public class RadialControllerMenuItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerMenuItem.WithDefault, IWinRTObject {
  private val __1998804965_Interface: IRadialControllerMenuItem.WithDefault by lazy {
    as_1998804965()
  }


  public override val __1998804965_Ptr: JNAPointer? by lazy {
    __1998804965_Interface.__1998804965_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1998804965_Interface)

  private fun as_1998804965(): IRadialControllerMenuItem.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerMenuItem.ABI.makeIRadialControllerMenuItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerMenuItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerMenuItem.ABI.makeIRadialControllerMenuItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerMenuItem> {
    public override fun getValue() = RadialControllerMenuItem(pointer.getPointer(0))

    public fun setValue(value: RadialControllerMenuItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerMenuItem, MemoryAddress> {
    public val IRadialControllerMenuItemStatics_Instance: IRadialControllerMenuItemStatics by lazy {
      createIRadialControllerMenuItemStatics()
    }


    public val IRadialControllerMenuItemStatics2_Instance: IRadialControllerMenuItemStatics2 by
        lazy {
      createIRadialControllerMenuItemStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadialControllerMenuItemStatics(): IRadialControllerMenuItemStatics {
      val refiid = Guid.REFIID(IRadialControllerMenuItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.RadialControllerMenuItem".toHandle(),refiid,interfacePtr)
      val result =
          IRadialControllerMenuItemStatics.ABI.makeIRadialControllerMenuItemStatics(interfacePtr.value)
      return result
    }

    public fun createIRadialControllerMenuItemStatics2(): IRadialControllerMenuItemStatics2 {
      val refiid = Guid.REFIID(IRadialControllerMenuItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.RadialControllerMenuItem".toHandle(),refiid,interfacePtr)
      val result =
          IRadialControllerMenuItemStatics2.ABI.makeIRadialControllerMenuItemStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RadialControllerMenuItem {
      val address = segment.toRawLongValue()
      return RadialControllerMenuItem(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerMenuItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromIcon(displayText: String, icon: RandomAccessStreamReference) =
        ABI.IRadialControllerMenuItemStatics_Instance.CreateFromIcon(displayText, icon)

    public fun CreateFromKnownIcon(displayText: String, value: RadialControllerMenuKnownIcon) =
        ABI.IRadialControllerMenuItemStatics_Instance.CreateFromKnownIcon(displayText, value)

    public fun CreateFromFontGlyph(
      displayText: String,
      glyph: String,
      fontFamily: String
    ) = ABI.IRadialControllerMenuItemStatics2_Instance.CreateFromFontGlyph(displayText, glyph,
        fontFamily)

    public fun CreateFromFontGlyph(
      displayText: String,
      glyph: String,
      fontFamily: String,
      fontUri: Uri
    ) = ABI.IRadialControllerMenuItemStatics2_Instance.CreateFromFontGlyph(displayText, glyph,
        fontFamily, fontUri)
  }
}
