package Windows.Data.Xml.Dom

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XmlLoadSettings.ABI::class)
@Signature("rc(Windows.Data.Xml.Dom.XmlLoadSettings;{58aa07a8-fed6-46f7-b4c5-fb1ba72108d6})")
@WinRTByReference(brClass = XmlLoadSettings.ByReference::class)
public class XmlLoadSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXmlLoadSettings.WithDefault, IWinRTObject {
  private val __413425545_Interface: IXmlLoadSettings.WithDefault by lazy {
    as_413425545()
  }


  public override val __413425545_Ptr: JNAPointer? by lazy {
    __413425545_Interface.__413425545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__413425545_Interface)

  public constructor() : this(ABI.activate())

  private fun as_413425545(): IXmlLoadSettings.WithDefault {
    if(pointer == NULL) {
      return(IXmlLoadSettings.ABI.makeIXmlLoadSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlLoadSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlLoadSettings.ABI.makeIXmlLoadSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XmlLoadSettings> {
    public override fun getValue() = XmlLoadSettings(pointer.getPointer(0))

    public fun setValue(value: XmlLoadSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XmlLoadSettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Dom.XmlLoadSettings".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): XmlLoadSettings {
      val address = segment.toRawLongValue()
      return XmlLoadSettings(Pointer(address))
    }

    public override fun toNative(obj: XmlLoadSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
